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

public class CustomerGatewayVendor extends AbstractModel{

    /**
    * Platform.
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * Software version.
    */
    @SerializedName("SoftwareVersion")
    @Expose
    private String SoftwareVersion;

    /**
    * Vendor name.
    */
    @SerializedName("VendorName")
    @Expose
    private String VendorName;

    /**
     * Get Platform. 
     * @return Platform Platform.
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set Platform.
     * @param Platform Platform.
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get Software version. 
     * @return SoftwareVersion Software version.
     */
    public String getSoftwareVersion() {
        return this.SoftwareVersion;
    }

    /**
     * Set Software version.
     * @param SoftwareVersion Software version.
     */
    public void setSoftwareVersion(String SoftwareVersion) {
        this.SoftwareVersion = SoftwareVersion;
    }

    /**
     * Get Vendor name. 
     * @return VendorName Vendor name.
     */
    public String getVendorName() {
        return this.VendorName;
    }

    /**
     * Set Vendor name.
     * @param VendorName Vendor name.
     */
    public void setVendorName(String VendorName) {
        this.VendorName = VendorName;
    }

    public CustomerGatewayVendor() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomerGatewayVendor(CustomerGatewayVendor source) {
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.SoftwareVersion != null) {
            this.SoftwareVersion = new String(source.SoftwareVersion);
        }
        if (source.VendorName != null) {
            this.VendorName = new String(source.VendorName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "SoftwareVersion", this.SoftwareVersion);
        this.setParamSimple(map, prefix + "VendorName", this.VendorName);

    }
}

