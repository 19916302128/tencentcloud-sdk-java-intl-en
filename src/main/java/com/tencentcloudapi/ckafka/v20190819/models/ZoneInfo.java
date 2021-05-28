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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneInfo extends AbstractModel{

    /**
    * Zone ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Whether it is an internal App.
    */
    @SerializedName("IsInternalApp")
    @Expose
    private Long IsInternalApp;

    /**
    * app id
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Identifier
    */
    @SerializedName("Flag")
    @Expose
    private Boolean Flag;

    /**
    * Zone name
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Zone status
    */
    @SerializedName("ZoneStatus")
    @Expose
    private Long ZoneStatus;

    /**
    * Extra identifier
    */
    @SerializedName("Exflag")
    @Expose
    private String Exflag;

    /**
    * JSON object. The key is the model. The value `true` means “sold out”, and `false` means “not sold out”.
    */
    @SerializedName("SoldOut")
    @Expose
    private String SoldOut;

    /**
     * Get Zone ID 
     * @return ZoneId Zone ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID
     * @param ZoneId Zone ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Whether it is an internal App. 
     * @return IsInternalApp Whether it is an internal App.
     */
    public Long getIsInternalApp() {
        return this.IsInternalApp;
    }

    /**
     * Set Whether it is an internal App.
     * @param IsInternalApp Whether it is an internal App.
     */
    public void setIsInternalApp(Long IsInternalApp) {
        this.IsInternalApp = IsInternalApp;
    }

    /**
     * Get app id 
     * @return AppId app id
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set app id
     * @param AppId app id
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Identifier 
     * @return Flag Identifier
     */
    public Boolean getFlag() {
        return this.Flag;
    }

    /**
     * Set Identifier
     * @param Flag Identifier
     */
    public void setFlag(Boolean Flag) {
        this.Flag = Flag;
    }

    /**
     * Get Zone name 
     * @return ZoneName Zone name
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set Zone name
     * @param ZoneName Zone name
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get Zone status 
     * @return ZoneStatus Zone status
     */
    public Long getZoneStatus() {
        return this.ZoneStatus;
    }

    /**
     * Set Zone status
     * @param ZoneStatus Zone status
     */
    public void setZoneStatus(Long ZoneStatus) {
        this.ZoneStatus = ZoneStatus;
    }

    /**
     * Get Extra identifier 
     * @return Exflag Extra identifier
     */
    public String getExflag() {
        return this.Exflag;
    }

    /**
     * Set Extra identifier
     * @param Exflag Extra identifier
     */
    public void setExflag(String Exflag) {
        this.Exflag = Exflag;
    }

    /**
     * Get JSON object. The key is the model. The value `true` means “sold out”, and `false` means “not sold out”. 
     * @return SoldOut JSON object. The key is the model. The value `true` means “sold out”, and `false` means “not sold out”.
     */
    public String getSoldOut() {
        return this.SoldOut;
    }

    /**
     * Set JSON object. The key is the model. The value `true` means “sold out”, and `false` means “not sold out”.
     * @param SoldOut JSON object. The key is the model. The value `true` means “sold out”, and `false` means “not sold out”.
     */
    public void setSoldOut(String SoldOut) {
        this.SoldOut = SoldOut;
    }

    public ZoneInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneInfo(ZoneInfo source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.IsInternalApp != null) {
            this.IsInternalApp = new Long(source.IsInternalApp);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Flag != null) {
            this.Flag = new Boolean(source.Flag);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.ZoneStatus != null) {
            this.ZoneStatus = new Long(source.ZoneStatus);
        }
        if (source.Exflag != null) {
            this.Exflag = new String(source.Exflag);
        }
        if (source.SoldOut != null) {
            this.SoldOut = new String(source.SoldOut);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "IsInternalApp", this.IsInternalApp);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Flag", this.Flag);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "ZoneStatus", this.ZoneStatus);
        this.setParamSimple(map, prefix + "Exflag", this.Exflag);
        this.setParamSimple(map, prefix + "SoldOut", this.SoldOut);

    }
}
