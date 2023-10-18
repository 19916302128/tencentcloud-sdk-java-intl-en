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
package com.tencentcloudapi.sms.v20190711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteSmsSignRequest extends AbstractModel {

    /**
    * ID of signature to be deleted.
    */
    @SerializedName("SignId")
    @Expose
    private Long SignId;

    /**
     * Get ID of signature to be deleted. 
     * @return SignId ID of signature to be deleted.
     */
    public Long getSignId() {
        return this.SignId;
    }

    /**
     * Set ID of signature to be deleted.
     * @param SignId ID of signature to be deleted.
     */
    public void setSignId(Long SignId) {
        this.SignId = SignId;
    }

    public DeleteSmsSignRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteSmsSignRequest(DeleteSmsSignRequest source) {
        if (source.SignId != null) {
            this.SignId = new Long(source.SignId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SignId", this.SignId);

    }
}

