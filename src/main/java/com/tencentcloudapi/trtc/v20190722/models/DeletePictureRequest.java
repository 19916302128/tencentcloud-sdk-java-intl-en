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

public class DeletePictureRequest extends AbstractModel{

    /**
    * Image ID
    */
    @SerializedName("PictureId")
    @Expose
    private Long PictureId;

    /**
    * Application ID
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
     * Get Image ID 
     * @return PictureId Image ID
     */
    public Long getPictureId() {
        return this.PictureId;
    }

    /**
     * Set Image ID
     * @param PictureId Image ID
     */
    public void setPictureId(Long PictureId) {
        this.PictureId = PictureId;
    }

    /**
     * Get Application ID 
     * @return SdkAppId Application ID
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set Application ID
     * @param SdkAppId Application ID
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PictureId", this.PictureId);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);

    }
}

