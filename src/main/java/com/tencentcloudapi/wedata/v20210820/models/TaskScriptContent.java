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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskScriptContent extends AbstractModel {

    /**
    * Script content Base64 encoded
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ScriptContent")
    @Expose
    private String ScriptContent;

    /**
     * Get Script content Base64 encoded
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ScriptContent Script content Base64 encoded
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getScriptContent() {
        return this.ScriptContent;
    }

    /**
     * Set Script content Base64 encoded
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ScriptContent Script content Base64 encoded
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setScriptContent(String ScriptContent) {
        this.ScriptContent = ScriptContent;
    }

    public TaskScriptContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskScriptContent(TaskScriptContent source) {
        if (source.ScriptContent != null) {
            this.ScriptContent = new String(source.ScriptContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScriptContent", this.ScriptContent);

    }
}

