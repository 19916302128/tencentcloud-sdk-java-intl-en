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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDbAssetsResponse extends AbstractModel {

    /**
    * Total number of results
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Total of assets
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Data")
    @Expose
    private DBAssetVO [] Data;

    /**
    * List of regions
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionList")
    @Expose
    private FilterDataObject [] RegionList;

    /**
    * List of asset types
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("AssetTypeList")
    @Expose
    private FilterDataObject [] AssetTypeList;

    /**
    * List of VPCs
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcList")
    @Expose
    private FilterDataObject [] VpcList;

    /**
    * List of users (AppId)
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppIdList")
    @Expose
    private FilterDataObject [] AppIdList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of results
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Total Total number of results
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of results
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Total Total number of results
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Total of assets
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Data Total of assets
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public DBAssetVO [] getData() {
        return this.Data;
    }

    /**
     * Set Total of assets
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Data Total of assets
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setData(DBAssetVO [] Data) {
        this.Data = Data;
    }

    /**
     * Get List of regions
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return RegionList List of regions
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public FilterDataObject [] getRegionList() {
        return this.RegionList;
    }

    /**
     * Set List of regions
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param RegionList List of regions
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setRegionList(FilterDataObject [] RegionList) {
        this.RegionList = RegionList;
    }

    /**
     * Get List of asset types
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return AssetTypeList List of asset types
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public FilterDataObject [] getAssetTypeList() {
        return this.AssetTypeList;
    }

    /**
     * Set List of asset types
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param AssetTypeList List of asset types
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAssetTypeList(FilterDataObject [] AssetTypeList) {
        this.AssetTypeList = AssetTypeList;
    }

    /**
     * Get List of VPCs
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return VpcList List of VPCs
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public FilterDataObject [] getVpcList() {
        return this.VpcList;
    }

    /**
     * Set List of VPCs
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param VpcList List of VPCs
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setVpcList(FilterDataObject [] VpcList) {
        this.VpcList = VpcList;
    }

    /**
     * Get List of users (AppId)
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return AppIdList List of users (AppId)
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public FilterDataObject [] getAppIdList() {
        return this.AppIdList;
    }

    /**
     * Set List of users (AppId)
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param AppIdList List of users (AppId)
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAppIdList(FilterDataObject [] AppIdList) {
        this.AppIdList = AppIdList;
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

    public DescribeDbAssetsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDbAssetsResponse(DescribeDbAssetsResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Data != null) {
            this.Data = new DBAssetVO[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new DBAssetVO(source.Data[i]);
            }
        }
        if (source.RegionList != null) {
            this.RegionList = new FilterDataObject[source.RegionList.length];
            for (int i = 0; i < source.RegionList.length; i++) {
                this.RegionList[i] = new FilterDataObject(source.RegionList[i]);
            }
        }
        if (source.AssetTypeList != null) {
            this.AssetTypeList = new FilterDataObject[source.AssetTypeList.length];
            for (int i = 0; i < source.AssetTypeList.length; i++) {
                this.AssetTypeList[i] = new FilterDataObject(source.AssetTypeList[i]);
            }
        }
        if (source.VpcList != null) {
            this.VpcList = new FilterDataObject[source.VpcList.length];
            for (int i = 0; i < source.VpcList.length; i++) {
                this.VpcList[i] = new FilterDataObject(source.VpcList[i]);
            }
        }
        if (source.AppIdList != null) {
            this.AppIdList = new FilterDataObject[source.AppIdList.length];
            for (int i = 0; i < source.AppIdList.length; i++) {
                this.AppIdList[i] = new FilterDataObject(source.AppIdList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamArrayObj(map, prefix + "RegionList.", this.RegionList);
        this.setParamArrayObj(map, prefix + "AssetTypeList.", this.AssetTypeList);
        this.setParamArrayObj(map, prefix + "VpcList.", this.VpcList);
        this.setParamArrayObj(map, prefix + "AppIdList.", this.AppIdList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

