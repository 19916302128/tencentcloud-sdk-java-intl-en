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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Bundle extends AbstractModel{

    /**
    * Package ID.
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * Memory size in GB.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * System disk type.
Valid values: 
<li> LOCAL_BASIC: local disk</li><li> LOCAL_SSD: local SSD disk</li><li> CLOUD_BASIC: HDD cloud disk</li><li> CLOUD_SSD: SSD cloud disk</li><li> CLOUD_PREMIUM: Premium Cloud Storage</li>
    */
    @SerializedName("SystemDiskType")
    @Expose
    private String SystemDiskType;

    /**
    * System disk size.
    */
    @SerializedName("SystemDiskSize")
    @Expose
    private Long SystemDiskSize;

    /**
    * Monthly network traffic in Gb.
    */
    @SerializedName("MonthlyTraffic")
    @Expose
    private Long MonthlyTraffic;

    /**
    * Whether Linux/Unix is supported.
    */
    @SerializedName("SupportLinuxUnixPlatform")
    @Expose
    private Boolean SupportLinuxUnixPlatform;

    /**
    * Whether Windows is supported.
    */
    @SerializedName("SupportWindowsPlatform")
    @Expose
    private Boolean SupportWindowsPlatform;

    /**
    * Current package unit price information.
    */
    @SerializedName("Price")
    @Expose
    private Price Price;

    /**
    * Number of CPU cores.
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * Peak bandwidth in Mbps.
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * Network billing mode.
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * Package sale status. Valid values: AVAILABLE, SOLD_OUT
    */
    @SerializedName("BundleSalesState")
    @Expose
    private String BundleSalesState;

    /**
    * Package type.
Valid values:
<li> GENERAL_BUNDLE: general</li><li> STORAGE_BUNDLE: Storage</li>
    */
    @SerializedName("BundleType")
    @Expose
    private String BundleType;

    /**
    * Package tag.
Valid values:
"ACTIVITY": promotional package
"NORMAL": regular package
"CAREFREE": carefree package
    */
    @SerializedName("BundleDisplayLabel")
    @Expose
    private String BundleDisplayLabel;

    /**
     * Get Package ID. 
     * @return BundleId Package ID.
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set Package ID.
     * @param BundleId Package ID.
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get Memory size in GB. 
     * @return Memory Memory size in GB.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory size in GB.
     * @param Memory Memory size in GB.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get System disk type.
Valid values: 
<li> LOCAL_BASIC: local disk</li><li> LOCAL_SSD: local SSD disk</li><li> CLOUD_BASIC: HDD cloud disk</li><li> CLOUD_SSD: SSD cloud disk</li><li> CLOUD_PREMIUM: Premium Cloud Storage</li> 
     * @return SystemDiskType System disk type.
Valid values: 
<li> LOCAL_BASIC: local disk</li><li> LOCAL_SSD: local SSD disk</li><li> CLOUD_BASIC: HDD cloud disk</li><li> CLOUD_SSD: SSD cloud disk</li><li> CLOUD_PREMIUM: Premium Cloud Storage</li>
     */
    public String getSystemDiskType() {
        return this.SystemDiskType;
    }

    /**
     * Set System disk type.
Valid values: 
<li> LOCAL_BASIC: local disk</li><li> LOCAL_SSD: local SSD disk</li><li> CLOUD_BASIC: HDD cloud disk</li><li> CLOUD_SSD: SSD cloud disk</li><li> CLOUD_PREMIUM: Premium Cloud Storage</li>
     * @param SystemDiskType System disk type.
Valid values: 
<li> LOCAL_BASIC: local disk</li><li> LOCAL_SSD: local SSD disk</li><li> CLOUD_BASIC: HDD cloud disk</li><li> CLOUD_SSD: SSD cloud disk</li><li> CLOUD_PREMIUM: Premium Cloud Storage</li>
     */
    public void setSystemDiskType(String SystemDiskType) {
        this.SystemDiskType = SystemDiskType;
    }

    /**
     * Get System disk size. 
     * @return SystemDiskSize System disk size.
     */
    public Long getSystemDiskSize() {
        return this.SystemDiskSize;
    }

    /**
     * Set System disk size.
     * @param SystemDiskSize System disk size.
     */
    public void setSystemDiskSize(Long SystemDiskSize) {
        this.SystemDiskSize = SystemDiskSize;
    }

    /**
     * Get Monthly network traffic in Gb. 
     * @return MonthlyTraffic Monthly network traffic in Gb.
     */
    public Long getMonthlyTraffic() {
        return this.MonthlyTraffic;
    }

    /**
     * Set Monthly network traffic in Gb.
     * @param MonthlyTraffic Monthly network traffic in Gb.
     */
    public void setMonthlyTraffic(Long MonthlyTraffic) {
        this.MonthlyTraffic = MonthlyTraffic;
    }

    /**
     * Get Whether Linux/Unix is supported. 
     * @return SupportLinuxUnixPlatform Whether Linux/Unix is supported.
     */
    public Boolean getSupportLinuxUnixPlatform() {
        return this.SupportLinuxUnixPlatform;
    }

    /**
     * Set Whether Linux/Unix is supported.
     * @param SupportLinuxUnixPlatform Whether Linux/Unix is supported.
     */
    public void setSupportLinuxUnixPlatform(Boolean SupportLinuxUnixPlatform) {
        this.SupportLinuxUnixPlatform = SupportLinuxUnixPlatform;
    }

    /**
     * Get Whether Windows is supported. 
     * @return SupportWindowsPlatform Whether Windows is supported.
     */
    public Boolean getSupportWindowsPlatform() {
        return this.SupportWindowsPlatform;
    }

    /**
     * Set Whether Windows is supported.
     * @param SupportWindowsPlatform Whether Windows is supported.
     */
    public void setSupportWindowsPlatform(Boolean SupportWindowsPlatform) {
        this.SupportWindowsPlatform = SupportWindowsPlatform;
    }

    /**
     * Get Current package unit price information. 
     * @return Price Current package unit price information.
     */
    public Price getPrice() {
        return this.Price;
    }

    /**
     * Set Current package unit price information.
     * @param Price Current package unit price information.
     */
    public void setPrice(Price Price) {
        this.Price = Price;
    }

    /**
     * Get Number of CPU cores. 
     * @return CPU Number of CPU cores.
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set Number of CPU cores.
     * @param CPU Number of CPU cores.
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get Peak bandwidth in Mbps. 
     * @return InternetMaxBandwidthOut Peak bandwidth in Mbps.
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set Peak bandwidth in Mbps.
     * @param InternetMaxBandwidthOut Peak bandwidth in Mbps.
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get Network billing mode. 
     * @return InternetChargeType Network billing mode.
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Set Network billing mode.
     * @param InternetChargeType Network billing mode.
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    /**
     * Get Package sale status. Valid values: AVAILABLE, SOLD_OUT 
     * @return BundleSalesState Package sale status. Valid values: AVAILABLE, SOLD_OUT
     */
    public String getBundleSalesState() {
        return this.BundleSalesState;
    }

    /**
     * Set Package sale status. Valid values: AVAILABLE, SOLD_OUT
     * @param BundleSalesState Package sale status. Valid values: AVAILABLE, SOLD_OUT
     */
    public void setBundleSalesState(String BundleSalesState) {
        this.BundleSalesState = BundleSalesState;
    }

    /**
     * Get Package type.
Valid values:
<li> GENERAL_BUNDLE: general</li><li> STORAGE_BUNDLE: Storage</li> 
     * @return BundleType Package type.
Valid values:
<li> GENERAL_BUNDLE: general</li><li> STORAGE_BUNDLE: Storage</li>
     */
    public String getBundleType() {
        return this.BundleType;
    }

    /**
     * Set Package type.
Valid values:
<li> GENERAL_BUNDLE: general</li><li> STORAGE_BUNDLE: Storage</li>
     * @param BundleType Package type.
Valid values:
<li> GENERAL_BUNDLE: general</li><li> STORAGE_BUNDLE: Storage</li>
     */
    public void setBundleType(String BundleType) {
        this.BundleType = BundleType;
    }

    /**
     * Get Package tag.
Valid values:
"ACTIVITY": promotional package
"NORMAL": regular package
"CAREFREE": carefree package 
     * @return BundleDisplayLabel Package tag.
Valid values:
"ACTIVITY": promotional package
"NORMAL": regular package
"CAREFREE": carefree package
     */
    public String getBundleDisplayLabel() {
        return this.BundleDisplayLabel;
    }

    /**
     * Set Package tag.
Valid values:
"ACTIVITY": promotional package
"NORMAL": regular package
"CAREFREE": carefree package
     * @param BundleDisplayLabel Package tag.
Valid values:
"ACTIVITY": promotional package
"NORMAL": regular package
"CAREFREE": carefree package
     */
    public void setBundleDisplayLabel(String BundleDisplayLabel) {
        this.BundleDisplayLabel = BundleDisplayLabel;
    }

    public Bundle() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Bundle(Bundle source) {
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.SystemDiskType != null) {
            this.SystemDiskType = new String(source.SystemDiskType);
        }
        if (source.SystemDiskSize != null) {
            this.SystemDiskSize = new Long(source.SystemDiskSize);
        }
        if (source.MonthlyTraffic != null) {
            this.MonthlyTraffic = new Long(source.MonthlyTraffic);
        }
        if (source.SupportLinuxUnixPlatform != null) {
            this.SupportLinuxUnixPlatform = new Boolean(source.SupportLinuxUnixPlatform);
        }
        if (source.SupportWindowsPlatform != null) {
            this.SupportWindowsPlatform = new Boolean(source.SupportWindowsPlatform);
        }
        if (source.Price != null) {
            this.Price = new Price(source.Price);
        }
        if (source.CPU != null) {
            this.CPU = new Long(source.CPU);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.InternetChargeType != null) {
            this.InternetChargeType = new String(source.InternetChargeType);
        }
        if (source.BundleSalesState != null) {
            this.BundleSalesState = new String(source.BundleSalesState);
        }
        if (source.BundleType != null) {
            this.BundleType = new String(source.BundleType);
        }
        if (source.BundleDisplayLabel != null) {
            this.BundleDisplayLabel = new String(source.BundleDisplayLabel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "SystemDiskType", this.SystemDiskType);
        this.setParamSimple(map, prefix + "SystemDiskSize", this.SystemDiskSize);
        this.setParamSimple(map, prefix + "MonthlyTraffic", this.MonthlyTraffic);
        this.setParamSimple(map, prefix + "SupportLinuxUnixPlatform", this.SupportLinuxUnixPlatform);
        this.setParamSimple(map, prefix + "SupportWindowsPlatform", this.SupportWindowsPlatform);
        this.setParamObj(map, prefix + "Price.", this.Price);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "InternetChargeType", this.InternetChargeType);
        this.setParamSimple(map, prefix + "BundleSalesState", this.BundleSalesState);
        this.setParamSimple(map, prefix + "BundleType", this.BundleType);
        this.setParamSimple(map, prefix + "BundleDisplayLabel", this.BundleDisplayLabel);

    }
}

