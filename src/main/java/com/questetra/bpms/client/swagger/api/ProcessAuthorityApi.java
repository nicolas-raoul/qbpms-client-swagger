/*
 * Questetra BPM Suite APIs
 * Questetra BPM Suite APIs
 *
 * OpenAPI spec version: 11.7.0
 * Contact: support@questetra.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.questetra.bpms.client.swagger.api;

import com.questetra.bpms.client.swagger.ApiCallback;
import com.questetra.bpms.client.swagger.ApiClient;
import com.questetra.bpms.client.swagger.ApiException;
import com.questetra.bpms.client.swagger.ApiResponse;
import com.questetra.bpms.client.swagger.Configuration;
import com.questetra.bpms.client.swagger.Pair;
import com.questetra.bpms.client.swagger.ProgressRequestBody;
import com.questetra.bpms.client.swagger.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.questetra.bpms.client.swagger.model.Errors;
import com.questetra.bpms.client.swagger.model.ProcessAuthorityList;
import com.questetra.bpms.client.swagger.model.ProcessAuthorityWrapper;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProcessAuthorityApi {
    private ApiClient apiClient;

    public ProcessAuthorityApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProcessAuthorityApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addToQgroup
     * @param processModelInfoId  (required)
     * @param type Type of Process Authorization 0:App Administrator Authorization 1:Process Manager Authorization 2:Data Viewer Authorization 3:Data Viewer Authorization(only Progress Information) (required)
     * @param qgroupId Organization ID (required)
     * @param leader  (optional)
     * @param descendantQgroups  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addToQgroupCall(Long processModelInfoId, Integer type, Long qgroupId, Boolean leader, Boolean descendantQgroups, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/API/Admin/ProcessAuthority/addToQgroup";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (processModelInfoId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "processModelInfoId", processModelInfoId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (type != null)
        localVarFormParams.put("type", type);
        if (qgroupId != null)
        localVarFormParams.put("qgroupId", qgroupId);
        if (leader != null)
        localVarFormParams.put("leader", leader);
        if (descendantQgroups != null)
        localVarFormParams.put("descendantQgroups", descendantQgroups);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basic", "oauth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addToQgroupValidateBeforeCall(Long processModelInfoId, Integer type, Long qgroupId, Boolean leader, Boolean descendantQgroups, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'processModelInfoId' is set
        if (processModelInfoId == null) {
            throw new ApiException("Missing the required parameter 'processModelInfoId' when calling addToQgroup(Async)");
        }
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling addToQgroup(Async)");
        }
        
        // verify the required parameter 'qgroupId' is set
        if (qgroupId == null) {
            throw new ApiException("Missing the required parameter 'qgroupId' when calling addToQgroup(Async)");
        }
        
        
        com.squareup.okhttp.Call call = addToQgroupCall(processModelInfoId, type, qgroupId, leader, descendantQgroups, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Granting a Process Privilege to an Organization
     * Granting a Process Privilege to an Organization
     * @param processModelInfoId  (required)
     * @param type Type of Process Authorization 0:App Administrator Authorization 1:Process Manager Authorization 2:Data Viewer Authorization 3:Data Viewer Authorization(only Progress Information) (required)
     * @param qgroupId Organization ID (required)
     * @param leader  (optional)
     * @param descendantQgroups  (optional)
     * @return ProcessAuthorityWrapper
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProcessAuthorityWrapper addToQgroup(Long processModelInfoId, Integer type, Long qgroupId, Boolean leader, Boolean descendantQgroups) throws ApiException {
        ApiResponse<ProcessAuthorityWrapper> resp = addToQgroupWithHttpInfo(processModelInfoId, type, qgroupId, leader, descendantQgroups);
        return resp.getData();
    }

    /**
     * Granting a Process Privilege to an Organization
     * Granting a Process Privilege to an Organization
     * @param processModelInfoId  (required)
     * @param type Type of Process Authorization 0:App Administrator Authorization 1:Process Manager Authorization 2:Data Viewer Authorization 3:Data Viewer Authorization(only Progress Information) (required)
     * @param qgroupId Organization ID (required)
     * @param leader  (optional)
     * @param descendantQgroups  (optional)
     * @return ApiResponse&lt;ProcessAuthorityWrapper&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProcessAuthorityWrapper> addToQgroupWithHttpInfo(Long processModelInfoId, Integer type, Long qgroupId, Boolean leader, Boolean descendantQgroups) throws ApiException {
        com.squareup.okhttp.Call call = addToQgroupValidateBeforeCall(processModelInfoId, type, qgroupId, leader, descendantQgroups, null, null);
        Type localVarReturnType = new TypeToken<ProcessAuthorityWrapper>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Granting a Process Privilege to an Organization (asynchronously)
     * Granting a Process Privilege to an Organization
     * @param processModelInfoId  (required)
     * @param type Type of Process Authorization 0:App Administrator Authorization 1:Process Manager Authorization 2:Data Viewer Authorization 3:Data Viewer Authorization(only Progress Information) (required)
     * @param qgroupId Organization ID (required)
     * @param leader  (optional)
     * @param descendantQgroups  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addToQgroupAsync(Long processModelInfoId, Integer type, Long qgroupId, Boolean leader, Boolean descendantQgroups, final ApiCallback<ProcessAuthorityWrapper> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addToQgroupValidateBeforeCall(processModelInfoId, type, qgroupId, leader, descendantQgroups, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProcessAuthorityWrapper>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for addToQrole
     * @param processModelInfoId  (required)
     * @param type Type of Process Authorization 0:App Administrator Authorization 1:Process Manager Authorization 2:Data Viewer Authorization 3:Data Viewer Authorization(only Progress Information) (required)
     * @param qroleId Role ID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addToQroleCall(Long processModelInfoId, Integer type, Long qroleId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/API/Admin/ProcessAuthority/addToQrole";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (processModelInfoId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "processModelInfoId", processModelInfoId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (type != null)
        localVarFormParams.put("type", type);
        if (qroleId != null)
        localVarFormParams.put("qroleId", qroleId);

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basic", "oauth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addToQroleValidateBeforeCall(Long processModelInfoId, Integer type, Long qroleId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'processModelInfoId' is set
        if (processModelInfoId == null) {
            throw new ApiException("Missing the required parameter 'processModelInfoId' when calling addToQrole(Async)");
        }
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling addToQrole(Async)");
        }
        
        // verify the required parameter 'qroleId' is set
        if (qroleId == null) {
            throw new ApiException("Missing the required parameter 'qroleId' when calling addToQrole(Async)");
        }
        
        
        com.squareup.okhttp.Call call = addToQroleCall(processModelInfoId, type, qroleId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Granting a Process Privilege to a Role
     * Granting a Process Privilege to a Role
     * @param processModelInfoId  (required)
     * @param type Type of Process Authorization 0:App Administrator Authorization 1:Process Manager Authorization 2:Data Viewer Authorization 3:Data Viewer Authorization(only Progress Information) (required)
     * @param qroleId Role ID (required)
     * @return ProcessAuthorityWrapper
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProcessAuthorityWrapper addToQrole(Long processModelInfoId, Integer type, Long qroleId) throws ApiException {
        ApiResponse<ProcessAuthorityWrapper> resp = addToQroleWithHttpInfo(processModelInfoId, type, qroleId);
        return resp.getData();
    }

    /**
     * Granting a Process Privilege to a Role
     * Granting a Process Privilege to a Role
     * @param processModelInfoId  (required)
     * @param type Type of Process Authorization 0:App Administrator Authorization 1:Process Manager Authorization 2:Data Viewer Authorization 3:Data Viewer Authorization(only Progress Information) (required)
     * @param qroleId Role ID (required)
     * @return ApiResponse&lt;ProcessAuthorityWrapper&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProcessAuthorityWrapper> addToQroleWithHttpInfo(Long processModelInfoId, Integer type, Long qroleId) throws ApiException {
        com.squareup.okhttp.Call call = addToQroleValidateBeforeCall(processModelInfoId, type, qroleId, null, null);
        Type localVarReturnType = new TypeToken<ProcessAuthorityWrapper>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Granting a Process Privilege to a Role (asynchronously)
     * Granting a Process Privilege to a Role
     * @param processModelInfoId  (required)
     * @param type Type of Process Authorization 0:App Administrator Authorization 1:Process Manager Authorization 2:Data Viewer Authorization 3:Data Viewer Authorization(only Progress Information) (required)
     * @param qroleId Role ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addToQroleAsync(Long processModelInfoId, Integer type, Long qroleId, final ApiCallback<ProcessAuthorityWrapper> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addToQroleValidateBeforeCall(processModelInfoId, type, qroleId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProcessAuthorityWrapper>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for addToQuser
     * @param processModelInfoId  (required)
     * @param type Type of Process Authorization 0:App Administrator Authorization 1:Process Manager Authorization 2:Data Viewer Authorization 3:Data Viewer Authorization(only Progress Information) (required)
     * @param quserId User ID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addToQuserCall(Long processModelInfoId, Integer type, Long quserId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/API/Admin/ProcessAuthority/addToQuser";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (processModelInfoId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "processModelInfoId", processModelInfoId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (type != null)
        localVarFormParams.put("type", type);
        if (quserId != null)
        localVarFormParams.put("quserId", quserId);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basic", "oauth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addToQuserValidateBeforeCall(Long processModelInfoId, Integer type, Long quserId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'processModelInfoId' is set
        if (processModelInfoId == null) {
            throw new ApiException("Missing the required parameter 'processModelInfoId' when calling addToQuser(Async)");
        }
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling addToQuser(Async)");
        }
        
        // verify the required parameter 'quserId' is set
        if (quserId == null) {
            throw new ApiException("Missing the required parameter 'quserId' when calling addToQuser(Async)");
        }
        
        
        com.squareup.okhttp.Call call = addToQuserCall(processModelInfoId, type, quserId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Granting a Process Privilege to a User
     * Granting a Process Privilege to a User
     * @param processModelInfoId  (required)
     * @param type Type of Process Authorization 0:App Administrator Authorization 1:Process Manager Authorization 2:Data Viewer Authorization 3:Data Viewer Authorization(only Progress Information) (required)
     * @param quserId User ID (required)
     * @return ProcessAuthorityWrapper
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProcessAuthorityWrapper addToQuser(Long processModelInfoId, Integer type, Long quserId) throws ApiException {
        ApiResponse<ProcessAuthorityWrapper> resp = addToQuserWithHttpInfo(processModelInfoId, type, quserId);
        return resp.getData();
    }

    /**
     * Granting a Process Privilege to a User
     * Granting a Process Privilege to a User
     * @param processModelInfoId  (required)
     * @param type Type of Process Authorization 0:App Administrator Authorization 1:Process Manager Authorization 2:Data Viewer Authorization 3:Data Viewer Authorization(only Progress Information) (required)
     * @param quserId User ID (required)
     * @return ApiResponse&lt;ProcessAuthorityWrapper&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProcessAuthorityWrapper> addToQuserWithHttpInfo(Long processModelInfoId, Integer type, Long quserId) throws ApiException {
        com.squareup.okhttp.Call call = addToQuserValidateBeforeCall(processModelInfoId, type, quserId, null, null);
        Type localVarReturnType = new TypeToken<ProcessAuthorityWrapper>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Granting a Process Privilege to a User (asynchronously)
     * Granting a Process Privilege to a User
     * @param processModelInfoId  (required)
     * @param type Type of Process Authorization 0:App Administrator Authorization 1:Process Manager Authorization 2:Data Viewer Authorization 3:Data Viewer Authorization(only Progress Information) (required)
     * @param quserId User ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addToQuserAsync(Long processModelInfoId, Integer type, Long quserId, final ApiCallback<ProcessAuthorityWrapper> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addToQuserValidateBeforeCall(processModelInfoId, type, quserId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProcessAuthorityWrapper>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for delete
     * @param id Process Authorization ID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/API/Admin/ProcessAuthority/delete";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (id != null)
        localVarFormParams.put("id", id);

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basic", "oauth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteValidateBeforeCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling delete(Async)");
        }
        
        
        com.squareup.okhttp.Call call = deleteCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deleting a Process Privilege
     * Deleting a Process Privilege
     * @param id Process Authorization ID (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void delete(Long id) throws ApiException {
        deleteWithHttpInfo(id);
    }

    /**
     * Deleting a Process Privilege
     * Deleting a Process Privilege
     * @param id Process Authorization ID (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = deleteValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deleting a Process Privilege (asynchronously)
     * Deleting a Process Privilege
     * @param id Process Authorization ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteAsync(Long id, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for list
     * @param processModelInfoId  (required)
     * @param type Type of Process Authorization 0:App Administrator Authorization 1:Process Manager Authorization 2:Data Viewer Authorization 3:Data Viewer Authorization(only Progress Information) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listCall(Long processModelInfoId, Integer type, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/API/Admin/ProcessAuthority/list";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (processModelInfoId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "processModelInfoId", processModelInfoId));
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basic", "oauth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listValidateBeforeCall(Long processModelInfoId, Integer type, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'processModelInfoId' is set
        if (processModelInfoId == null) {
            throw new ApiException("Missing the required parameter 'processModelInfoId' when calling list(Async)");
        }
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling list(Async)");
        }
        
        
        com.squareup.okhttp.Call call = listCall(processModelInfoId, type, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieving a List of Process Privilege
     * Retrieving a List of Process Privilege
     * @param processModelInfoId  (required)
     * @param type Type of Process Authorization 0:App Administrator Authorization 1:Process Manager Authorization 2:Data Viewer Authorization 3:Data Viewer Authorization(only Progress Information) (required)
     * @return ProcessAuthorityList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProcessAuthorityList list(Long processModelInfoId, Integer type) throws ApiException {
        ApiResponse<ProcessAuthorityList> resp = listWithHttpInfo(processModelInfoId, type);
        return resp.getData();
    }

    /**
     * Retrieving a List of Process Privilege
     * Retrieving a List of Process Privilege
     * @param processModelInfoId  (required)
     * @param type Type of Process Authorization 0:App Administrator Authorization 1:Process Manager Authorization 2:Data Viewer Authorization 3:Data Viewer Authorization(only Progress Information) (required)
     * @return ApiResponse&lt;ProcessAuthorityList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProcessAuthorityList> listWithHttpInfo(Long processModelInfoId, Integer type) throws ApiException {
        com.squareup.okhttp.Call call = listValidateBeforeCall(processModelInfoId, type, null, null);
        Type localVarReturnType = new TypeToken<ProcessAuthorityList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieving a List of Process Privilege (asynchronously)
     * Retrieving a List of Process Privilege
     * @param processModelInfoId  (required)
     * @param type Type of Process Authorization 0:App Administrator Authorization 1:Process Manager Authorization 2:Data Viewer Authorization 3:Data Viewer Authorization(only Progress Information) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listAsync(Long processModelInfoId, Integer type, final ApiCallback<ProcessAuthorityList> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listValidateBeforeCall(processModelInfoId, type, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProcessAuthorityList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
