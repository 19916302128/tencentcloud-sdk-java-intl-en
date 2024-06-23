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

public class OrderFieldOptional extends AbstractModel {

    /**
    * Sorting Field Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Sorting Direction: ASC|DESC
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
     * Get Sorting Field Name 
     * @return Name Sorting Field Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Sorting Field Name
     * @param Name Sorting Field Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Sorting Direction: ASC|DESC 
     * @return Direction Sorting Direction: ASC|DESC
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set Sorting Direction: ASC|DESC
     * @param Direction Sorting Direction: ASC|DESC
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    public OrderFieldOptional() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrderFieldOptional(OrderFieldOptional source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Direction", this.Direction);

    }
}

