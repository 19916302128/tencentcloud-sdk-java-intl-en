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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddressTemplateItem extends AbstractModel{

    /**
    * Start address
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * End address
    */
    @SerializedName("To")
    @Expose
    private String To;

    /**
     * Get Start address 
     * @return From Start address
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set Start address
     * @param From Start address
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get End address 
     * @return To End address
     */
    public String getTo() {
        return this.To;
    }

    /**
     * Set End address
     * @param To End address
     */
    public void setTo(String To) {
        this.To = To;
    }

    public AddressTemplateItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddressTemplateItem(AddressTemplateItem source) {
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.To != null) {
            this.To = new String(source.To);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "To", this.To);

    }
}

