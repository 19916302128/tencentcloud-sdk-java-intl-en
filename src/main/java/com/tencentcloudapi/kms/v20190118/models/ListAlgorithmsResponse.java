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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAlgorithmsResponse extends AbstractModel {

    /**
    * Symmetric encryption algorithms supported in this region
    */
    @SerializedName("SymmetricAlgorithms")
    @Expose
    private AlgorithmInfo [] SymmetricAlgorithms;

    /**
    * Asymmetric encryption algorithms supported in this region
    */
    @SerializedName("AsymmetricAlgorithms")
    @Expose
    private AlgorithmInfo [] AsymmetricAlgorithms;

    /**
    * Asymmetric signature verification algorithms supported in the current region
    */
    @SerializedName("AsymmetricSignVerifyAlgorithms")
    @Expose
    private AlgorithmInfo [] AsymmetricSignVerifyAlgorithms;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Symmetric encryption algorithms supported in this region 
     * @return SymmetricAlgorithms Symmetric encryption algorithms supported in this region
     */
    public AlgorithmInfo [] getSymmetricAlgorithms() {
        return this.SymmetricAlgorithms;
    }

    /**
     * Set Symmetric encryption algorithms supported in this region
     * @param SymmetricAlgorithms Symmetric encryption algorithms supported in this region
     */
    public void setSymmetricAlgorithms(AlgorithmInfo [] SymmetricAlgorithms) {
        this.SymmetricAlgorithms = SymmetricAlgorithms;
    }

    /**
     * Get Asymmetric encryption algorithms supported in this region 
     * @return AsymmetricAlgorithms Asymmetric encryption algorithms supported in this region
     */
    public AlgorithmInfo [] getAsymmetricAlgorithms() {
        return this.AsymmetricAlgorithms;
    }

    /**
     * Set Asymmetric encryption algorithms supported in this region
     * @param AsymmetricAlgorithms Asymmetric encryption algorithms supported in this region
     */
    public void setAsymmetricAlgorithms(AlgorithmInfo [] AsymmetricAlgorithms) {
        this.AsymmetricAlgorithms = AsymmetricAlgorithms;
    }

    /**
     * Get Asymmetric signature verification algorithms supported in the current region 
     * @return AsymmetricSignVerifyAlgorithms Asymmetric signature verification algorithms supported in the current region
     */
    public AlgorithmInfo [] getAsymmetricSignVerifyAlgorithms() {
        return this.AsymmetricSignVerifyAlgorithms;
    }

    /**
     * Set Asymmetric signature verification algorithms supported in the current region
     * @param AsymmetricSignVerifyAlgorithms Asymmetric signature verification algorithms supported in the current region
     */
    public void setAsymmetricSignVerifyAlgorithms(AlgorithmInfo [] AsymmetricSignVerifyAlgorithms) {
        this.AsymmetricSignVerifyAlgorithms = AsymmetricSignVerifyAlgorithms;
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

    public ListAlgorithmsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAlgorithmsResponse(ListAlgorithmsResponse source) {
        if (source.SymmetricAlgorithms != null) {
            this.SymmetricAlgorithms = new AlgorithmInfo[source.SymmetricAlgorithms.length];
            for (int i = 0; i < source.SymmetricAlgorithms.length; i++) {
                this.SymmetricAlgorithms[i] = new AlgorithmInfo(source.SymmetricAlgorithms[i]);
            }
        }
        if (source.AsymmetricAlgorithms != null) {
            this.AsymmetricAlgorithms = new AlgorithmInfo[source.AsymmetricAlgorithms.length];
            for (int i = 0; i < source.AsymmetricAlgorithms.length; i++) {
                this.AsymmetricAlgorithms[i] = new AlgorithmInfo(source.AsymmetricAlgorithms[i]);
            }
        }
        if (source.AsymmetricSignVerifyAlgorithms != null) {
            this.AsymmetricSignVerifyAlgorithms = new AlgorithmInfo[source.AsymmetricSignVerifyAlgorithms.length];
            for (int i = 0; i < source.AsymmetricSignVerifyAlgorithms.length; i++) {
                this.AsymmetricSignVerifyAlgorithms[i] = new AlgorithmInfo(source.AsymmetricSignVerifyAlgorithms[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SymmetricAlgorithms.", this.SymmetricAlgorithms);
        this.setParamArrayObj(map, prefix + "AsymmetricAlgorithms.", this.AsymmetricAlgorithms);
        this.setParamArrayObj(map, prefix + "AsymmetricSignVerifyAlgorithms.", this.AsymmetricSignVerifyAlgorithms);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

