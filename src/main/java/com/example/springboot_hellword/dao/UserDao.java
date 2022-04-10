package com.example.springboot_hellword.dao;

import com.example.springboot_hellword.entity.po.UserPo;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public class UserDao implements JpaRepository<UserPo, Long> {


    @Override
    public List<UserPo> findAll() {
        return null;
    }

    @Override
    public List<UserPo> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<UserPo> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<UserPo> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(UserPo entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends UserPo> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends UserPo> S save(S entity) {
        return null;
    }

    @Override
    public <S extends UserPo> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<UserPo> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends UserPo> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends UserPo> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<UserPo> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public UserPo getOne(Long aLong) {
        return null;
    }

    @Override
    public UserPo getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends UserPo> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends UserPo> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends UserPo> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends UserPo> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends UserPo> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends UserPo> boolean exists(Example<S> example) {
        return false;
    }
}
