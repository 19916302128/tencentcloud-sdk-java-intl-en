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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceReleaseHistory extends AbstractModel {

    /**
    * Total number of published versions.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Historical version list.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VersionList")
    @Expose
    private ServiceReleaseHistoryInfo [] VersionList;

    /**
     * Get Total number of published versions.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TotalCount Total number of published versions.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of published versions.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TotalCount Total number of published versions.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Historical version list.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return VersionList Historical version list.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ServiceReleaseHistoryInfo [] getVersionList() {
        return this.VersionList;
    }

    /**
     * Set Historical version list.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param VersionList Historical version list.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVersionList(ServiceReleaseHistoryInfo [] VersionList) {
        this.VersionList = VersionList;
    }

    public ServiceReleaseHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceReleaseHistory(ServiceReleaseHistory source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.VersionList != null) {
            this.VersionList = new ServiceReleaseHistoryInfo[source.VersionList.length];
            for (int i = 0; i < source.VersionList.length; i++) {
                this.VersionList[i] = new ServiceReleaseHistoryInfo(source.VersionList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "VersionList.", this.VersionList);

    }
}

