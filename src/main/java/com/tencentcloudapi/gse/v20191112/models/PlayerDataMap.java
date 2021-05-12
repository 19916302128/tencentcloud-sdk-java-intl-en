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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlayerDataMap extends AbstractModel{

    /**
    * The key of player custom data. It should contain 1 to 1024 ASCII characters.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * The value of player custom data. It should contain 1 to 2048 ASCII characters.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get The key of player custom data. It should contain 1 to 1024 ASCII characters. 
     * @return Key The key of player custom data. It should contain 1 to 1024 ASCII characters.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set The key of player custom data. It should contain 1 to 1024 ASCII characters.
     * @param Key The key of player custom data. It should contain 1 to 1024 ASCII characters.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get The value of player custom data. It should contain 1 to 2048 ASCII characters. 
     * @return Value The value of player custom data. It should contain 1 to 2048 ASCII characters.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set The value of player custom data. It should contain 1 to 2048 ASCII characters.
     * @param Value The value of player custom data. It should contain 1 to 2048 ASCII characters.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public PlayerDataMap() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlayerDataMap(PlayerDataMap source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

