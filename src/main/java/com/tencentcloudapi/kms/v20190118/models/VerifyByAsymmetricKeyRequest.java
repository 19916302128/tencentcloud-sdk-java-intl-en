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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyByAsymmetricKeyRequest extends AbstractModel{

    /**
    * Unique ID of a key
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Signature value, which is generated by calling the KMS signature API.
    */
    @SerializedName("SignatureValue")
    @Expose
    private String SignatureValue;

    /**
    * Full message or message abstract. Before Base64 encoding, an original message can contain up to 4,096 bytes while a message abstract must be 32 bytes.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Signature algorithm. The valid values include `SM2DSA`, `ECC_P256_R1`, `RSA_PSS_SHA_256`, and `RSA_PKCS1_SHA_256`, etc. You can get a full list of supported algorithms using the ListAlgorithms API.
    */
    @SerializedName("Algorithm")
    @Expose
    private String Algorithm;

    /**
    * Message type. Valid values: `RAW` (indicating an original message; used by default if the parameter is not passed in) and `DIGEST`.
    */
    @SerializedName("MessageType")
    @Expose
    private String MessageType;

    /**
     * Get Unique ID of a key 
     * @return KeyId Unique ID of a key
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Unique ID of a key
     * @param KeyId Unique ID of a key
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get Signature value, which is generated by calling the KMS signature API. 
     * @return SignatureValue Signature value, which is generated by calling the KMS signature API.
     */
    public String getSignatureValue() {
        return this.SignatureValue;
    }

    /**
     * Set Signature value, which is generated by calling the KMS signature API.
     * @param SignatureValue Signature value, which is generated by calling the KMS signature API.
     */
    public void setSignatureValue(String SignatureValue) {
        this.SignatureValue = SignatureValue;
    }

    /**
     * Get Full message or message abstract. Before Base64 encoding, an original message can contain up to 4,096 bytes while a message abstract must be 32 bytes. 
     * @return Message Full message or message abstract. Before Base64 encoding, an original message can contain up to 4,096 bytes while a message abstract must be 32 bytes.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Full message or message abstract. Before Base64 encoding, an original message can contain up to 4,096 bytes while a message abstract must be 32 bytes.
     * @param Message Full message or message abstract. Before Base64 encoding, an original message can contain up to 4,096 bytes while a message abstract must be 32 bytes.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Signature algorithm. The valid values include `SM2DSA`, `ECC_P256_R1`, `RSA_PSS_SHA_256`, and `RSA_PKCS1_SHA_256`, etc. You can get a full list of supported algorithms using the ListAlgorithms API. 
     * @return Algorithm Signature algorithm. The valid values include `SM2DSA`, `ECC_P256_R1`, `RSA_PSS_SHA_256`, and `RSA_PKCS1_SHA_256`, etc. You can get a full list of supported algorithms using the ListAlgorithms API.
     */
    public String getAlgorithm() {
        return this.Algorithm;
    }

    /**
     * Set Signature algorithm. The valid values include `SM2DSA`, `ECC_P256_R1`, `RSA_PSS_SHA_256`, and `RSA_PKCS1_SHA_256`, etc. You can get a full list of supported algorithms using the ListAlgorithms API.
     * @param Algorithm Signature algorithm. The valid values include `SM2DSA`, `ECC_P256_R1`, `RSA_PSS_SHA_256`, and `RSA_PKCS1_SHA_256`, etc. You can get a full list of supported algorithms using the ListAlgorithms API.
     */
    public void setAlgorithm(String Algorithm) {
        this.Algorithm = Algorithm;
    }

    /**
     * Get Message type. Valid values: `RAW` (indicating an original message; used by default if the parameter is not passed in) and `DIGEST`. 
     * @return MessageType Message type. Valid values: `RAW` (indicating an original message; used by default if the parameter is not passed in) and `DIGEST`.
     */
    public String getMessageType() {
        return this.MessageType;
    }

    /**
     * Set Message type. Valid values: `RAW` (indicating an original message; used by default if the parameter is not passed in) and `DIGEST`.
     * @param MessageType Message type. Valid values: `RAW` (indicating an original message; used by default if the parameter is not passed in) and `DIGEST`.
     */
    public void setMessageType(String MessageType) {
        this.MessageType = MessageType;
    }

    public VerifyByAsymmetricKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyByAsymmetricKeyRequest(VerifyByAsymmetricKeyRequest source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.SignatureValue != null) {
            this.SignatureValue = new String(source.SignatureValue);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Algorithm != null) {
            this.Algorithm = new String(source.Algorithm);
        }
        if (source.MessageType != null) {
            this.MessageType = new String(source.MessageType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "SignatureValue", this.SignatureValue);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Algorithm", this.Algorithm);
        this.setParamSimple(map, prefix + "MessageType", this.MessageType);

    }
}

