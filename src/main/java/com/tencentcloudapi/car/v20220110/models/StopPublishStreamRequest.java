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
package com.tencentcloudapi.car.v20220110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StopPublishStreamRequest extends AbstractModel {

    /**
    * Unique user ID, which is customized by you and is not understood by CAR. It can also be randomly generated using the timestamp and should be kept unchanged during user reconnection.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
     * Get Unique user ID, which is customized by you and is not understood by CAR. It can also be randomly generated using the timestamp and should be kept unchanged during user reconnection. 
     * @return UserId Unique user ID, which is customized by you and is not understood by CAR. It can also be randomly generated using the timestamp and should be kept unchanged during user reconnection.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set Unique user ID, which is customized by you and is not understood by CAR. It can also be randomly generated using the timestamp and should be kept unchanged during user reconnection.
     * @param UserId Unique user ID, which is customized by you and is not understood by CAR. It can also be randomly generated using the timestamp and should be kept unchanged during user reconnection.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public StopPublishStreamRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StopPublishStreamRequest(StopPublishStreamRequest source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

