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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetServiceLinkedRoleDeletionStatusRequest extends AbstractModel {

    /**
    * Deletion task ID
    */
    @SerializedName("DeletionTaskId")
    @Expose
    private String DeletionTaskId;

    /**
     * Get Deletion task ID 
     * @return DeletionTaskId Deletion task ID
     */
    public String getDeletionTaskId() {
        return this.DeletionTaskId;
    }

    /**
     * Set Deletion task ID
     * @param DeletionTaskId Deletion task ID
     */
    public void setDeletionTaskId(String DeletionTaskId) {
        this.DeletionTaskId = DeletionTaskId;
    }

    public GetServiceLinkedRoleDeletionStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetServiceLinkedRoleDeletionStatusRequest(GetServiceLinkedRoleDeletionStatusRequest source) {
        if (source.DeletionTaskId != null) {
            this.DeletionTaskId = new String(source.DeletionTaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeletionTaskId", this.DeletionTaskId);

    }
}

