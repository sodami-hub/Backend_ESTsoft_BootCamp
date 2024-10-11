package com.example.springjpaquerydslproject.repository;

import com.example.springjpaquerydslproject.entity.QComment;
import com.example.springjpaquerydslproject.entity.QPost;
import com.example.springjpaquerydslproject.model.TestDTO;
import com.example.springjpaquerydslproject.model.TestDTO2;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TestRepositoryQueryDslImpl implements TestRepository{

    @Autowired
    private JPAQueryFactory jpaQueryFactory;

    @Override
    public List<TestDTO> selectPostTest() {
        QPost qpost = QPost.post;
        QComment qcomment = QComment.comment;
        // select t1.id AS postId, t1.title, t1.content, t2.id AS commentId  t2.content AS commentContent
        // from posts t1
        // left outer join comments t2 ON t1.id = t2.post_id
        var result = jpaQueryFactory
                .select(
                        Projections.constructor(
                                TestDTO.class,
                                qpost.id,
                                qpost.title,
                                qpost.content,
                                qcomment.id,
                                qcomment.content,
                                qpost.userId
                        )
                )
                .from(qpost)
                .leftJoin(qcomment).on(qpost.id.eq(qcomment.post.id))
                .fetch();

        return result;
    }


    // SELECT t1.id, t1.title, t1.content, count(t2.id)
    // FROM posts t1
    // LEFT OUTER JOIN comments t2 ON t1.id = t2.post_id
    // GROUP BY t1.id, t1.title, t1.content
    @Override
    public List<TestDTO2> selectPostWithCount() {
        QPost qpost = QPost.post;
        QComment qcomment = QComment.comment;

        var result = jpaQueryFactory
                .select(
                        Projections.constructor(
                                TestDTO2.class,
                                qpost.id,
                                qpost.title,
                                qpost.content,
                                qcomment.id.count().as("commentCount"),
                                qpost.userId
                        )
                )
                .from(qpost)
                .leftJoin(qcomment).on(qpost.id.eq(qcomment.post.id))
                .groupBy(qpost.id, qpost.title, qpost.content)
                .fetch();

        return result;
    }
}
