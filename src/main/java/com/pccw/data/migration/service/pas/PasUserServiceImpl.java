package com.pccw.data.migration.service.pas;

import com.pccw.data.migration.entity.pas.PasUser;
import com.pccw.data.migration.repository.pas.PasUserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: Created by Jim@80992399 on 2020-08-07 10:38
 **/
@Service
public class PasUserServiceImpl implements PasUserService {

    @Resource
    private PasUserRepository repository;

    @Override
    public List<PasUser> findAll() {
        return repository.findAll();
    }
}
