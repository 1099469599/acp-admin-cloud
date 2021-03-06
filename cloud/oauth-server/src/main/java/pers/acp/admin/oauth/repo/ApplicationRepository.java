package pers.acp.admin.oauth.repo;

import pers.acp.admin.oauth.base.OauthBaseRepository;
import pers.acp.admin.oauth.entity.Application;

import java.util.List;

/**
 * @author zhangbin by 2018-1-17 17:44
 * @since JDK 11
 */
public interface ApplicationRepository extends OauthBaseRepository<Application, String> {

    void deleteByIdInAndCovert(List<String> idList, boolean covert);

    List<Application> findAllByOrderByAppnameAsc();

}
