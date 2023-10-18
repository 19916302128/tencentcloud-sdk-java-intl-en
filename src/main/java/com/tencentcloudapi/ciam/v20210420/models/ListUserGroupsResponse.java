/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.ciam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListUserGroupsResponse extends AbstractModel {

    /**
    * User group list
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Content")
    @Expose
    private UserGroup [] Content;

    /**
    * Total number
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Pagination
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Pageable")
    @Expose
    private Pageable Pageable;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get User group list
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Content User group list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public UserGroup [] getContent() {
        return this.Content;
    }

    /**
     * Set User group list
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Content User group list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setContent(UserGroup [] Content) {
        this.Content = Content;
    }

    /**
     * Get Total number
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Total Total number
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Total Total number
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Pagination
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Pageable Pagination
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Pageable getPageable() {
        return this.Pageable;
    }

    /**
     * Set Pagination
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Pageable Pagination
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPageable(Pageable Pageable) {
        this.Pageable = Pageable;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ListUserGroupsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListUserGroupsResponse(ListUserGroupsResponse source) {
        if (source.Content != null) {
            this.Content = new UserGroup[source.Content.length];
            for (int i = 0; i < source.Content.length; i++) {
                this.Content[i] = new UserGroup(source.Content[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Pageable != null) {
            this.Pageable = new Pageable(source.Pageable);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamObj(map, prefix + "Pageable.", this.Pageable);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

