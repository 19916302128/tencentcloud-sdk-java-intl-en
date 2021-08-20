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
package com.tencentcloudapi.iotcloud.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDeviceResponse extends AbstractModel{

    /**
    * Device name
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * Base64-encoded symmetric encryption key, which is returned if symmetric encryption is used
    */
    @SerializedName("DevicePsk")
    @Expose
    private String DevicePsk;

    /**
    * Device certificate, which authenticates client identity during TLS connection establishment and is returned if asymmetric encryption is used
    */
    @SerializedName("DeviceCert")
    @Expose
    private String DeviceCert;

    /**
    * Device private key, which authenticates client identity during TLS connection establishment and is returned if asymmetric encryption is used. Tencent Cloud does not store the key. Please store it by yourself properly.
    */
    @SerializedName("DevicePrivateKey")
    @Expose
    private String DevicePrivateKey;

    /**
    * DevEUI of a LoRa device, which is returned for a LoRa device
    */
    @SerializedName("LoraDevEui")
    @Expose
    private String LoraDevEui;

    /**
    * MoteType of a LoRa device, which is returned for a LoRa device
    */
    @SerializedName("LoraMoteType")
    @Expose
    private Long LoraMoteType;

    /**
    * AppKey of a LoRa device, which is returned for a LoRa device
    */
    @SerializedName("LoraAppKey")
    @Expose
    private String LoraAppKey;

    /**
    * NwkKey of a LoRa device, which is returned for a LoRa device
    */
    @SerializedName("LoraNwkKey")
    @Expose
    private String LoraNwkKey;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Device name 
     * @return DeviceName Device name
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set Device name
     * @param DeviceName Device name
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get Base64-encoded symmetric encryption key, which is returned if symmetric encryption is used 
     * @return DevicePsk Base64-encoded symmetric encryption key, which is returned if symmetric encryption is used
     */
    public String getDevicePsk() {
        return this.DevicePsk;
    }

    /**
     * Set Base64-encoded symmetric encryption key, which is returned if symmetric encryption is used
     * @param DevicePsk Base64-encoded symmetric encryption key, which is returned if symmetric encryption is used
     */
    public void setDevicePsk(String DevicePsk) {
        this.DevicePsk = DevicePsk;
    }

    /**
     * Get Device certificate, which authenticates client identity during TLS connection establishment and is returned if asymmetric encryption is used 
     * @return DeviceCert Device certificate, which authenticates client identity during TLS connection establishment and is returned if asymmetric encryption is used
     */
    public String getDeviceCert() {
        return this.DeviceCert;
    }

    /**
     * Set Device certificate, which authenticates client identity during TLS connection establishment and is returned if asymmetric encryption is used
     * @param DeviceCert Device certificate, which authenticates client identity during TLS connection establishment and is returned if asymmetric encryption is used
     */
    public void setDeviceCert(String DeviceCert) {
        this.DeviceCert = DeviceCert;
    }

    /**
     * Get Device private key, which authenticates client identity during TLS connection establishment and is returned if asymmetric encryption is used. Tencent Cloud does not store the key. Please store it by yourself properly. 
     * @return DevicePrivateKey Device private key, which authenticates client identity during TLS connection establishment and is returned if asymmetric encryption is used. Tencent Cloud does not store the key. Please store it by yourself properly.
     */
    public String getDevicePrivateKey() {
        return this.DevicePrivateKey;
    }

    /**
     * Set Device private key, which authenticates client identity during TLS connection establishment and is returned if asymmetric encryption is used. Tencent Cloud does not store the key. Please store it by yourself properly.
     * @param DevicePrivateKey Device private key, which authenticates client identity during TLS connection establishment and is returned if asymmetric encryption is used. Tencent Cloud does not store the key. Please store it by yourself properly.
     */
    public void setDevicePrivateKey(String DevicePrivateKey) {
        this.DevicePrivateKey = DevicePrivateKey;
    }

    /**
     * Get DevEUI of a LoRa device, which is returned for a LoRa device 
     * @return LoraDevEui DevEUI of a LoRa device, which is returned for a LoRa device
     */
    public String getLoraDevEui() {
        return this.LoraDevEui;
    }

    /**
     * Set DevEUI of a LoRa device, which is returned for a LoRa device
     * @param LoraDevEui DevEUI of a LoRa device, which is returned for a LoRa device
     */
    public void setLoraDevEui(String LoraDevEui) {
        this.LoraDevEui = LoraDevEui;
    }

    /**
     * Get MoteType of a LoRa device, which is returned for a LoRa device 
     * @return LoraMoteType MoteType of a LoRa device, which is returned for a LoRa device
     */
    public Long getLoraMoteType() {
        return this.LoraMoteType;
    }

    /**
     * Set MoteType of a LoRa device, which is returned for a LoRa device
     * @param LoraMoteType MoteType of a LoRa device, which is returned for a LoRa device
     */
    public void setLoraMoteType(Long LoraMoteType) {
        this.LoraMoteType = LoraMoteType;
    }

    /**
     * Get AppKey of a LoRa device, which is returned for a LoRa device 
     * @return LoraAppKey AppKey of a LoRa device, which is returned for a LoRa device
     */
    public String getLoraAppKey() {
        return this.LoraAppKey;
    }

    /**
     * Set AppKey of a LoRa device, which is returned for a LoRa device
     * @param LoraAppKey AppKey of a LoRa device, which is returned for a LoRa device
     */
    public void setLoraAppKey(String LoraAppKey) {
        this.LoraAppKey = LoraAppKey;
    }

    /**
     * Get NwkKey of a LoRa device, which is returned for a LoRa device 
     * @return LoraNwkKey NwkKey of a LoRa device, which is returned for a LoRa device
     */
    public String getLoraNwkKey() {
        return this.LoraNwkKey;
    }

    /**
     * Set NwkKey of a LoRa device, which is returned for a LoRa device
     * @param LoraNwkKey NwkKey of a LoRa device, which is returned for a LoRa device
     */
    public void setLoraNwkKey(String LoraNwkKey) {
        this.LoraNwkKey = LoraNwkKey;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateDeviceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDeviceResponse(CreateDeviceResponse source) {
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.DevicePsk != null) {
            this.DevicePsk = new String(source.DevicePsk);
        }
        if (source.DeviceCert != null) {
            this.DeviceCert = new String(source.DeviceCert);
        }
        if (source.DevicePrivateKey != null) {
            this.DevicePrivateKey = new String(source.DevicePrivateKey);
        }
        if (source.LoraDevEui != null) {
            this.LoraDevEui = new String(source.LoraDevEui);
        }
        if (source.LoraMoteType != null) {
            this.LoraMoteType = new Long(source.LoraMoteType);
        }
        if (source.LoraAppKey != null) {
            this.LoraAppKey = new String(source.LoraAppKey);
        }
        if (source.LoraNwkKey != null) {
            this.LoraNwkKey = new String(source.LoraNwkKey);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "DevicePsk", this.DevicePsk);
        this.setParamSimple(map, prefix + "DeviceCert", this.DeviceCert);
        this.setParamSimple(map, prefix + "DevicePrivateKey", this.DevicePrivateKey);
        this.setParamSimple(map, prefix + "LoraDevEui", this.LoraDevEui);
        this.setParamSimple(map, prefix + "LoraMoteType", this.LoraMoteType);
        this.setParamSimple(map, prefix + "LoraAppKey", this.LoraAppKey);
        this.setParamSimple(map, prefix + "LoraNwkKey", this.LoraNwkKey);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

