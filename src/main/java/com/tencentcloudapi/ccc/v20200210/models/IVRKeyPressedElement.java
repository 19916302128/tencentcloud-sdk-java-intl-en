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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IVRKeyPressedElement extends AbstractModel {

    /**
    * Key.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Tag associated with key.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
     * Get Key.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Key Key.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Key.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Key Key.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Tag associated with key.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Label Tag associated with key.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Tag associated with key.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Label Tag associated with key.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    public IVRKeyPressedElement() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IVRKeyPressedElement(IVRKeyPressedElement source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Label", this.Label);

    }
}
