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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAbnormalEventResponse extends AbstractModel{

    /**
    * Number of returned data entries.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Exceptional experience list.
    */
    @SerializedName("AbnormalExperienceList")
    @Expose
    private AbnormalExperience [] AbnormalExperienceList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of returned data entries. 
     * @return Total Number of returned data entries.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Number of returned data entries.
     * @param Total Number of returned data entries.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Exceptional experience list. 
     * @return AbnormalExperienceList Exceptional experience list.
     */
    public AbnormalExperience [] getAbnormalExperienceList() {
        return this.AbnormalExperienceList;
    }

    /**
     * Set Exceptional experience list.
     * @param AbnormalExperienceList Exceptional experience list.
     */
    public void setAbnormalExperienceList(AbnormalExperience [] AbnormalExperienceList) {
        this.AbnormalExperienceList = AbnormalExperienceList;
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

    public DescribeAbnormalEventResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAbnormalEventResponse(DescribeAbnormalEventResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.AbnormalExperienceList != null) {
            this.AbnormalExperienceList = new AbnormalExperience[source.AbnormalExperienceList.length];
            for (int i = 0; i < source.AbnormalExperienceList.length; i++) {
                this.AbnormalExperienceList[i] = new AbnormalExperience(source.AbnormalExperienceList[i]);
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
        this.setParamArrayObj(map, prefix + "AbnormalExperienceList.", this.AbnormalExperienceList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

