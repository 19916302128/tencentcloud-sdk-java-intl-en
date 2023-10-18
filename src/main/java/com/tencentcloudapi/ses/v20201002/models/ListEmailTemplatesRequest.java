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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListEmailTemplatesRequest extends AbstractModel {

    /**
    * Number of templates to get. This parameter is used for pagination.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Template offset to get. This parameter is used for pagination.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Number of templates to get. This parameter is used for pagination. 
     * @return Limit Number of templates to get. This parameter is used for pagination.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of templates to get. This parameter is used for pagination.
     * @param Limit Number of templates to get. This parameter is used for pagination.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Template offset to get. This parameter is used for pagination. 
     * @return Offset Template offset to get. This parameter is used for pagination.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Template offset to get. This parameter is used for pagination.
     * @param Offset Template offset to get. This parameter is used for pagination.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public ListEmailTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListEmailTemplatesRequest(ListEmailTemplatesRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

