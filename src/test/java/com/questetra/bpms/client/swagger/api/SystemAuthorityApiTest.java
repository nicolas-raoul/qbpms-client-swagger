/*
 * Questetra BPM Suite APIs
 * Questetra BPM Suite APIs
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@questetra.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.questetra.bpms.client.swagger.api;

import com.questetra.bpms.client.swagger.ApiException;
import com.questetra.bpms.client.swagger.model.Errors;
import com.questetra.bpms.client.swagger.model.SystemAuthorityList;
import com.questetra.bpms.client.swagger.model.SystemAuthorityWrapper;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SystemAuthorityApi
 */
@Ignore
public class SystemAuthorityApiTest {

    private final SystemAuthorityApi api = new SystemAuthorityApi();

    
    /**
     * Granting a System Privilege to an Organization
     *
     * Granting a System Privilege to an Organization
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addToQgroupTest() throws ApiException {
        Integer type = null;
        Long qgroupId = null;
        Boolean leader = null;
        Boolean descendantQgroups = null;
        SystemAuthorityWrapper response = api.addToQgroup(type, qgroupId, leader, descendantQgroups);

        // TODO: test validations
    }
    
    /**
     * Granting a System Privilege to a Role
     *
     * Granting a System Privilege to a Role
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addToQroleTest() throws ApiException {
        Integer type = null;
        Long qroleId = null;
        SystemAuthorityWrapper response = api.addToQrole(type, qroleId);

        // TODO: test validations
    }
    
    /**
     * Granting a System Privilege to a User
     *
     * Granting a System Privilege to a User
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addToQuserTest() throws ApiException {
        Integer type = null;
        Long quserId = null;
        SystemAuthorityWrapper response = api.addToQuser(type, quserId);

        // TODO: test validations
    }
    
    /**
     * Deleting a System Privilege
     *
     * Deleting a System Privilege
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTest() throws ApiException {
        Long id = null;
        api.delete(id);

        // TODO: test validations
    }
    
    /**
     * Retrieving a List of System Privilege
     *
     * Retrieving a List of System Privilege
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTest() throws ApiException {
        Integer type = null;
        SystemAuthorityList response = api.list(type);

        // TODO: test validations
    }
    
}
