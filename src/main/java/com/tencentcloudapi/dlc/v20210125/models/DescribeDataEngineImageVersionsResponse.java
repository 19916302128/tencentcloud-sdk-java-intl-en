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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDataEngineImageVersionsResponse extends AbstractModel {

    /**
    * Major version of the image information list of clusters
    */
    @SerializedName("ImageParentVersions")
    @Expose
    private DataEngineImageVersion [] ImageParentVersions;

    /**
    * Total
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Major version of the image information list of clusters 
     * @return ImageParentVersions Major version of the image information list of clusters
     */
    public DataEngineImageVersion [] getImageParentVersions() {
        return this.ImageParentVersions;
    }

    /**
     * Set Major version of the image information list of clusters
     * @param ImageParentVersions Major version of the image information list of clusters
     */
    public void setImageParentVersions(DataEngineImageVersion [] ImageParentVersions) {
        this.ImageParentVersions = ImageParentVersions;
    }

    /**
     * Get Total 
     * @return Total Total
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total
     * @param Total Total
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDataEngineImageVersionsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataEngineImageVersionsResponse(DescribeDataEngineImageVersionsResponse source) {
        if (source.ImageParentVersions != null) {
            this.ImageParentVersions = new DataEngineImageVersion[source.ImageParentVersions.length];
            for (int i = 0; i < source.ImageParentVersions.length; i++) {
                this.ImageParentVersions[i] = new DataEngineImageVersion(source.ImageParentVersions[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ImageParentVersions.", this.ImageParentVersions);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
