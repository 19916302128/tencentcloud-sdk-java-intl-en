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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudVod extends AbstractModel {

    /**
    * The Tencent Cloud VOD parameters.
    */
    @SerializedName("TencentVod")
    @Expose
    private TencentVod TencentVod;

    /**
     * Get The Tencent Cloud VOD parameters. 
     * @return TencentVod The Tencent Cloud VOD parameters.
     */
    public TencentVod getTencentVod() {
        return this.TencentVod;
    }

    /**
     * Set The Tencent Cloud VOD parameters.
     * @param TencentVod The Tencent Cloud VOD parameters.
     */
    public void setTencentVod(TencentVod TencentVod) {
        this.TencentVod = TencentVod;
    }

    public CloudVod() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudVod(CloudVod source) {
        if (source.TencentVod != null) {
            this.TencentVod = new TencentVod(source.TencentVod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TencentVod.", this.TencentVod);

    }
}

