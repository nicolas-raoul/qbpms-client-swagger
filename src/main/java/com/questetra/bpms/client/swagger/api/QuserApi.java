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
import com.questetra.bpms.client.swagger.model.QuserList;
import com.questetra.bpms.client.swagger.model.QuserWithPrimaryQgroupWrapper;
import com.questetra.bpms.client.swagger.model.QuserWrapper;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuserApi {
    private ApiClient apiClient;

    public QuserApi() {
        this(Configuration.getDefaultApiClient());
    }

    public QuserApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for add
     * @param name  (required)
     * @param email  (required)
     * @param password  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addCall(String name, String email, String password, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/API/UGA/Quser/add";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (name != null)
        localVarFormParams.put("name", name);
        if (email != null)
        localVarFormParams.put("email", email);
        if (password != null)
        localVarFormParams.put("password", password);

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
    private com.squareup.okhttp.Call addValidateBeforeCall(String name, String email, String password, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling add(Async)");
        }
        
        // verify the required parameter 'email' is set
        if (email == null) {
            throw new ApiException("Missing the required parameter 'email' when calling add(Async)");
        }
        
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling add(Async)");
        }
        
        
        com.squareup.okhttp.Call call = addCall(name, email, password, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Creating a User Account
     * Creating a User Account
     * @param name  (required)
     * @param email  (required)
     * @param password  (required)
     * @return QuserWrapper
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QuserWrapper add(String name, String email, String password) throws ApiException {
        ApiResponse<QuserWrapper> resp = addWithHttpInfo(name, email, password);
        return resp.getData();
    }

    /**
     * Creating a User Account
     * Creating a User Account
     * @param name  (required)
     * @param email  (required)
     * @param password  (required)
     * @return ApiResponse&lt;QuserWrapper&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QuserWrapper> addWithHttpInfo(String name, String email, String password) throws ApiException {
        com.squareup.okhttp.Call call = addValidateBeforeCall(name, email, password, null, null);
        Type localVarReturnType = new TypeToken<QuserWrapper>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creating a User Account (asynchronously)
     * Creating a User Account
     * @param name  (required)
     * @param email  (required)
     * @param password  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addAsync(String name, String email, String password, final ApiCallback<QuserWrapper> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addValidateBeforeCall(name, email, password, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QuserWrapper>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for delete
     * @param id  (required)
     * @param delegateQuserId  (optional)
     * @param delegateQgroupId  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteCall(Long id, Long delegateQuserId, Long delegateQgroupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/API/UGA/Quser/delete";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (id != null)
        localVarFormParams.put("id", id);
        if (delegateQuserId != null)
        localVarFormParams.put("delegateQuserId", delegateQuserId);
        if (delegateQgroupId != null)
        localVarFormParams.put("delegateQgroupId", delegateQgroupId);

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
    private com.squareup.okhttp.Call deleteValidateBeforeCall(Long id, Long delegateQuserId, Long delegateQgroupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling delete(Async)");
        }
        
        
        com.squareup.okhttp.Call call = deleteCall(id, delegateQuserId, delegateQgroupId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deleting a User Account
     * Deleting a User Account
     * @param id  (required)
     * @param delegateQuserId  (optional)
     * @param delegateQgroupId  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void delete(Long id, Long delegateQuserId, Long delegateQgroupId) throws ApiException {
        deleteWithHttpInfo(id, delegateQuserId, delegateQgroupId);
    }

    /**
     * Deleting a User Account
     * Deleting a User Account
     * @param id  (required)
     * @param delegateQuserId  (optional)
     * @param delegateQgroupId  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteWithHttpInfo(Long id, Long delegateQuserId, Long delegateQgroupId) throws ApiException {
        com.squareup.okhttp.Call call = deleteValidateBeforeCall(id, delegateQuserId, delegateQgroupId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deleting a User Account (asynchronously)
     * Deleting a User Account
     * @param id  (required)
     * @param delegateQuserId  (optional)
     * @param delegateQgroupId  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteAsync(Long id, Long delegateQuserId, Long delegateQgroupId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteValidateBeforeCall(id, delegateQuserId, delegateQgroupId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for find
     * @param id  (optional)
     * @param email  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call findCall(Long id, String email, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/API/User/Quser/find";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (id != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
        if (email != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));

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
    private com.squareup.okhttp.Call findValidateBeforeCall(Long id, String email, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = findCall(id, email, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieving a User Account
     * Retrieving a User Account
     * @param id  (optional)
     * @param email  (optional)
     * @return QuserWithPrimaryQgroupWrapper
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QuserWithPrimaryQgroupWrapper find(Long id, String email) throws ApiException {
        ApiResponse<QuserWithPrimaryQgroupWrapper> resp = findWithHttpInfo(id, email);
        return resp.getData();
    }

    /**
     * Retrieving a User Account
     * Retrieving a User Account
     * @param id  (optional)
     * @param email  (optional)
     * @return ApiResponse&lt;QuserWithPrimaryQgroupWrapper&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QuserWithPrimaryQgroupWrapper> findWithHttpInfo(Long id, String email) throws ApiException {
        com.squareup.okhttp.Call call = findValidateBeforeCall(id, email, null, null);
        Type localVarReturnType = new TypeToken<QuserWithPrimaryQgroupWrapper>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieving a User Account (asynchronously)
     * Retrieving a User Account
     * @param id  (optional)
     * @param email  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call findAsync(Long id, String email, final ApiCallback<QuserWithPrimaryQgroupWrapper> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = findValidateBeforeCall(id, email, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QuserWithPrimaryQgroupWrapper>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for list
     * @param query  (optional)
     * @param limit Max number of records to return (optional)
     * @param start The offset of the first record to return (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listCall(String query, Integer limit, Integer start, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/API/User/Quser/list";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (query != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        if (start != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));

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
    private com.squareup.okhttp.Call listValidateBeforeCall(String query, Integer limit, Integer start, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = listCall(query, limit, start, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieving a List of Users
     * Retrieving a List of Users
     * @param query  (optional)
     * @param limit Max number of records to return (optional)
     * @param start The offset of the first record to return (optional)
     * @return QuserList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QuserList list(String query, Integer limit, Integer start) throws ApiException {
        ApiResponse<QuserList> resp = listWithHttpInfo(query, limit, start);
        return resp.getData();
    }

    /**
     * Retrieving a List of Users
     * Retrieving a List of Users
     * @param query  (optional)
     * @param limit Max number of records to return (optional)
     * @param start The offset of the first record to return (optional)
     * @return ApiResponse&lt;QuserList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QuserList> listWithHttpInfo(String query, Integer limit, Integer start) throws ApiException {
        com.squareup.okhttp.Call call = listValidateBeforeCall(query, limit, start, null, null);
        Type localVarReturnType = new TypeToken<QuserList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieving a List of Users (asynchronously)
     * Retrieving a List of Users
     * @param query  (optional)
     * @param limit Max number of records to return (optional)
     * @param start The offset of the first record to return (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listAsync(String query, Integer limit, Integer start, final ApiCallback<QuserList> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listValidateBeforeCall(query, limit, start, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QuserList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for self
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call selfCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/API/User/Quser/self";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

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
    private com.squareup.okhttp.Call selfValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = selfCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieving the user’s own User Account
     * Retrieving the user’s own User Account
     * @return QuserWithPrimaryQgroupWrapper
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QuserWithPrimaryQgroupWrapper self() throws ApiException {
        ApiResponse<QuserWithPrimaryQgroupWrapper> resp = selfWithHttpInfo();
        return resp.getData();
    }

    /**
     * Retrieving the user’s own User Account
     * Retrieving the user’s own User Account
     * @return ApiResponse&lt;QuserWithPrimaryQgroupWrapper&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QuserWithPrimaryQgroupWrapper> selfWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = selfValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<QuserWithPrimaryQgroupWrapper>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieving the user’s own User Account (asynchronously)
     * Retrieving the user’s own User Account
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call selfAsync(final ApiCallback<QuserWithPrimaryQgroupWrapper> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = selfValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QuserWithPrimaryQgroupWrapper>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for update
     * @param id  (required)
     * @param name  (optional)
     * @param email  (optional)
     * @param password  (optional)
     * @param primaryQgroupId  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateCall(Long id, String name, String email, String password, Long primaryQgroupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/API/UGA/Quser/update";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (id != null)
        localVarFormParams.put("id", id);
        if (name != null)
        localVarFormParams.put("name", name);
        if (email != null)
        localVarFormParams.put("email", email);
        if (password != null)
        localVarFormParams.put("password", password);
        if (primaryQgroupId != null)
        localVarFormParams.put("primaryQgroupId", primaryQgroupId);

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
    private com.squareup.okhttp.Call updateValidateBeforeCall(Long id, String name, String email, String password, Long primaryQgroupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling update(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateCall(id, name, email, password, primaryQgroupId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Updating a User Account
     * Updating a User Account
     * @param id  (required)
     * @param name  (optional)
     * @param email  (optional)
     * @param password  (optional)
     * @param primaryQgroupId  (optional)
     * @return QuserWithPrimaryQgroupWrapper
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QuserWithPrimaryQgroupWrapper update(Long id, String name, String email, String password, Long primaryQgroupId) throws ApiException {
        ApiResponse<QuserWithPrimaryQgroupWrapper> resp = updateWithHttpInfo(id, name, email, password, primaryQgroupId);
        return resp.getData();
    }

    /**
     * Updating a User Account
     * Updating a User Account
     * @param id  (required)
     * @param name  (optional)
     * @param email  (optional)
     * @param password  (optional)
     * @param primaryQgroupId  (optional)
     * @return ApiResponse&lt;QuserWithPrimaryQgroupWrapper&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QuserWithPrimaryQgroupWrapper> updateWithHttpInfo(Long id, String name, String email, String password, Long primaryQgroupId) throws ApiException {
        com.squareup.okhttp.Call call = updateValidateBeforeCall(id, name, email, password, primaryQgroupId, null, null);
        Type localVarReturnType = new TypeToken<QuserWithPrimaryQgroupWrapper>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updating a User Account (asynchronously)
     * Updating a User Account
     * @param id  (required)
     * @param name  (optional)
     * @param email  (optional)
     * @param password  (optional)
     * @param primaryQgroupId  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateAsync(Long id, String name, String email, String password, Long primaryQgroupId, final ApiCallback<QuserWithPrimaryQgroupWrapper> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateValidateBeforeCall(id, name, email, password, primaryQgroupId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QuserWithPrimaryQgroupWrapper>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
