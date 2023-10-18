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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAppResp extends AbstractModel {

    /**
    * Application ID, automatically generated by the backend.
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
    * Application name, the input of `AppName`.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * Project ID, the input of `ProjectId`.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Application key, used to initialize GME SDK.
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * Timestamp, indicating when the service is created.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Configuration information of Voice Chat
    */
    @SerializedName("RealtimeSpeechConf")
    @Expose
    private RealtimeSpeechConf RealtimeSpeechConf;

    /**
    * Configuration information of Voice Messaging
    */
    @SerializedName("VoiceMessageConf")
    @Expose
    private VoiceMessageConf VoiceMessageConf;

    /**
    * Configuration information of Voice Analysis Service
    */
    @SerializedName("VoiceFilterConf")
    @Expose
    private VoiceFilterConf VoiceFilterConf;

    /**
    * Configuration information of Speech-to-Text
    */
    @SerializedName("AsrConf")
    @Expose
    private AsrConf AsrConf;

    /**
     * Get Application ID, automatically generated by the backend. 
     * @return BizId Application ID, automatically generated by the backend.
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * Set Application ID, automatically generated by the backend.
     * @param BizId Application ID, automatically generated by the backend.
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    /**
     * Get Application name, the input of `AppName`. 
     * @return AppName Application name, the input of `AppName`.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set Application name, the input of `AppName`.
     * @param AppName Application name, the input of `AppName`.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get Project ID, the input of `ProjectId`. 
     * @return ProjectId Project ID, the input of `ProjectId`.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID, the input of `ProjectId`.
     * @param ProjectId Project ID, the input of `ProjectId`.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Application key, used to initialize GME SDK. 
     * @return SecretKey Application key, used to initialize GME SDK.
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set Application key, used to initialize GME SDK.
     * @param SecretKey Application key, used to initialize GME SDK.
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get Timestamp, indicating when the service is created. 
     * @return CreateTime Timestamp, indicating when the service is created.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Timestamp, indicating when the service is created.
     * @param CreateTime Timestamp, indicating when the service is created.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Configuration information of Voice Chat 
     * @return RealtimeSpeechConf Configuration information of Voice Chat
     */
    public RealtimeSpeechConf getRealtimeSpeechConf() {
        return this.RealtimeSpeechConf;
    }

    /**
     * Set Configuration information of Voice Chat
     * @param RealtimeSpeechConf Configuration information of Voice Chat
     */
    public void setRealtimeSpeechConf(RealtimeSpeechConf RealtimeSpeechConf) {
        this.RealtimeSpeechConf = RealtimeSpeechConf;
    }

    /**
     * Get Configuration information of Voice Messaging 
     * @return VoiceMessageConf Configuration information of Voice Messaging
     */
    public VoiceMessageConf getVoiceMessageConf() {
        return this.VoiceMessageConf;
    }

    /**
     * Set Configuration information of Voice Messaging
     * @param VoiceMessageConf Configuration information of Voice Messaging
     */
    public void setVoiceMessageConf(VoiceMessageConf VoiceMessageConf) {
        this.VoiceMessageConf = VoiceMessageConf;
    }

    /**
     * Get Configuration information of Voice Analysis Service 
     * @return VoiceFilterConf Configuration information of Voice Analysis Service
     */
    public VoiceFilterConf getVoiceFilterConf() {
        return this.VoiceFilterConf;
    }

    /**
     * Set Configuration information of Voice Analysis Service
     * @param VoiceFilterConf Configuration information of Voice Analysis Service
     */
    public void setVoiceFilterConf(VoiceFilterConf VoiceFilterConf) {
        this.VoiceFilterConf = VoiceFilterConf;
    }

    /**
     * Get Configuration information of Speech-to-Text 
     * @return AsrConf Configuration information of Speech-to-Text
     */
    public AsrConf getAsrConf() {
        return this.AsrConf;
    }

    /**
     * Set Configuration information of Speech-to-Text
     * @param AsrConf Configuration information of Speech-to-Text
     */
    public void setAsrConf(AsrConf AsrConf) {
        this.AsrConf = AsrConf;
    }

    public CreateAppResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAppResp(CreateAppResp source) {
        if (source.BizId != null) {
            this.BizId = new Long(source.BizId);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.RealtimeSpeechConf != null) {
            this.RealtimeSpeechConf = new RealtimeSpeechConf(source.RealtimeSpeechConf);
        }
        if (source.VoiceMessageConf != null) {
            this.VoiceMessageConf = new VoiceMessageConf(source.VoiceMessageConf);
        }
        if (source.VoiceFilterConf != null) {
            this.VoiceFilterConf = new VoiceFilterConf(source.VoiceFilterConf);
        }
        if (source.AsrConf != null) {
            this.AsrConf = new AsrConf(source.AsrConf);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizId", this.BizId);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamObj(map, prefix + "RealtimeSpeechConf.", this.RealtimeSpeechConf);
        this.setParamObj(map, prefix + "VoiceMessageConf.", this.VoiceMessageConf);
        this.setParamObj(map, prefix + "VoiceFilterConf.", this.VoiceFilterConf);
        this.setParamObj(map, prefix + "AsrConf.", this.AsrConf);

    }
}

