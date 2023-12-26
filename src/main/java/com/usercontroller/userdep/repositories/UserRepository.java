package com.usercontroller.userdep.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import com.usercontroller.userdep.entidies.User;

public interface  UserRepository extends JpaRepositoryImplementation<User, Long>{

}
