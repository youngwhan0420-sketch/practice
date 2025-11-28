package mapper;

import entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper // 이게 user_mapper.xml에 있는 SQL과 연결해준다.
public interface UserMapper { //DB테이블에 접근하기 위한 역할
    // 유저 추가
    void addUser (User user);
    // username으로 유저 조회하기
    Optional<User> getUserByUsername (String username);
    // userId로 유저 조회하기
    Optional<User> getUserByUserId (Integer userId);
    // 유저의 비밀번호 값 변경하기
    int updatePassword(User user);





}
