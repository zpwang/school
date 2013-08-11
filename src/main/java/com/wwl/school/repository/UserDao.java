package com.wwl.school.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.wwl.school.entity.User;

public interface UserDao extends PagingAndSortingRepository<User, Long> {
	User findByLoginName(String loginName);
}
