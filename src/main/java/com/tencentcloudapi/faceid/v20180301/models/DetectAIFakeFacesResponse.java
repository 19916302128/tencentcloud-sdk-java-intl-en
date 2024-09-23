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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectAIFakeFacesResponse extends AbstractModel {

    /**
    * Whether the detected image is an attack: Low: No attack risk Mid: Moderately suspected attack High: Highly suspected attack
    */
    @SerializedName("AttackRiskLevel")
    @Expose
    private String AttackRiskLevel;

    /**
    * A list of suspected attack traces detected. Note: When no attack traces are detected, an empty array is returned. This parameter is only used as a reference for result judgment. In actual applications, it is still recommended to use the result of AttackRiskLevel.
    */
    @SerializedName("AttackRiskDetailList")
    @Expose
    private AttackRiskDetail [] AttackRiskDetailList;

    /**
    * Additional Information
    */
    @SerializedName("ExtraInfo")
    @Expose
    private ExtraInfo ExtraInfo;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Whether the detected image is an attack: Low: No attack risk Mid: Moderately suspected attack High: Highly suspected attack 
     * @return AttackRiskLevel Whether the detected image is an attack: Low: No attack risk Mid: Moderately suspected attack High: Highly suspected attack
     */
    public String getAttackRiskLevel() {
        return this.AttackRiskLevel;
    }

    /**
     * Set Whether the detected image is an attack: Low: No attack risk Mid: Moderately suspected attack High: Highly suspected attack
     * @param AttackRiskLevel Whether the detected image is an attack: Low: No attack risk Mid: Moderately suspected attack High: Highly suspected attack
     */
    public void setAttackRiskLevel(String AttackRiskLevel) {
        this.AttackRiskLevel = AttackRiskLevel;
    }

    /**
     * Get A list of suspected attack traces detected. Note: When no attack traces are detected, an empty array is returned. This parameter is only used as a reference for result judgment. In actual applications, it is still recommended to use the result of AttackRiskLevel. 
     * @return AttackRiskDetailList A list of suspected attack traces detected. Note: When no attack traces are detected, an empty array is returned. This parameter is only used as a reference for result judgment. In actual applications, it is still recommended to use the result of AttackRiskLevel.
     */
    public AttackRiskDetail [] getAttackRiskDetailList() {
        return this.AttackRiskDetailList;
    }

    /**
     * Set A list of suspected attack traces detected. Note: When no attack traces are detected, an empty array is returned. This parameter is only used as a reference for result judgment. In actual applications, it is still recommended to use the result of AttackRiskLevel.
     * @param AttackRiskDetailList A list of suspected attack traces detected. Note: When no attack traces are detected, an empty array is returned. This parameter is only used as a reference for result judgment. In actual applications, it is still recommended to use the result of AttackRiskLevel.
     */
    public void setAttackRiskDetailList(AttackRiskDetail [] AttackRiskDetailList) {
        this.AttackRiskDetailList = AttackRiskDetailList;
    }

    /**
     * Get Additional Information 
     * @return ExtraInfo Additional Information
     */
    public ExtraInfo getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set Additional Information
     * @param ExtraInfo Additional Information
     */
    public void setExtraInfo(ExtraInfo ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
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

    public DetectAIFakeFacesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectAIFakeFacesResponse(DetectAIFakeFacesResponse source) {
        if (source.AttackRiskLevel != null) {
            this.AttackRiskLevel = new String(source.AttackRiskLevel);
        }
        if (source.AttackRiskDetailList != null) {
            this.AttackRiskDetailList = new AttackRiskDetail[source.AttackRiskDetailList.length];
            for (int i = 0; i < source.AttackRiskDetailList.length; i++) {
                this.AttackRiskDetailList[i] = new AttackRiskDetail(source.AttackRiskDetailList[i]);
            }
        }
        if (source.ExtraInfo != null) {
            this.ExtraInfo = new ExtraInfo(source.ExtraInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AttackRiskLevel", this.AttackRiskLevel);
        this.setParamArrayObj(map, prefix + "AttackRiskDetailList.", this.AttackRiskDetailList);
        this.setParamObj(map, prefix + "ExtraInfo.", this.ExtraInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
