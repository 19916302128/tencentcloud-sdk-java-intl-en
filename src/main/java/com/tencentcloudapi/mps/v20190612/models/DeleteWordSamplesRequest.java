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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteWordSamplesRequest extends AbstractModel {

    /**
    * Keyword. Array length limit: 100 words.
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
     * Get Keyword. Array length limit: 100 words. 
     * @return Keywords Keyword. Array length limit: 100 words.
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set Keyword. Array length limit: 100 words.
     * @param Keywords Keyword. Array length limit: 100 words.
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    public DeleteWordSamplesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteWordSamplesRequest(DeleteWordSamplesRequest source) {
        if (source.Keywords != null) {
            this.Keywords = new String[source.Keywords.length];
            for (int i = 0; i < source.Keywords.length; i++) {
                this.Keywords[i] = new String(source.Keywords[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Keywords.", this.Keywords);

    }
}

