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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCSRResponse extends AbstractModel{

    /**
    * The CSR ID.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * The account.
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * The domain.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * The organization name.
    */
    @SerializedName("Organization")
    @Expose
    private String Organization;

    /**
    * The department.
    */
    @SerializedName("Department")
    @Expose
    private String Department;

    /**
    * The email address.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * The province.
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * The city.
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * The country or region.
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * The key algorithm.
    */
    @SerializedName("EncryptAlgo")
    @Expose
    private String EncryptAlgo;

    /**
    * The algorithm parameter.
    */
    @SerializedName("KeyParameter")
    @Expose
    private String KeyParameter;

    /**
    * The remarks.
    */
    @SerializedName("Remarks")
    @Expose
    private String Remarks;

    /**
    * The status.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * The password of the private key.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KeyPassword")
    @Expose
    private String KeyPassword;

    /**
    * The creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * The CSR content.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CSR")
    @Expose
    private String CSR;

    /**
    * The content of the private key.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The CSR ID. 
     * @return Id The CSR ID.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set The CSR ID.
     * @param Id The CSR ID.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get The account. 
     * @return OwnerUin The account.
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set The account.
     * @param OwnerUin The account.
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get The domain. 
     * @return Domain The domain.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set The domain.
     * @param Domain The domain.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get The organization name. 
     * @return Organization The organization name.
     */
    public String getOrganization() {
        return this.Organization;
    }

    /**
     * Set The organization name.
     * @param Organization The organization name.
     */
    public void setOrganization(String Organization) {
        this.Organization = Organization;
    }

    /**
     * Get The department. 
     * @return Department The department.
     */
    public String getDepartment() {
        return this.Department;
    }

    /**
     * Set The department.
     * @param Department The department.
     */
    public void setDepartment(String Department) {
        this.Department = Department;
    }

    /**
     * Get The email address. 
     * @return Email The email address.
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set The email address.
     * @param Email The email address.
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get The province. 
     * @return Province The province.
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set The province.
     * @param Province The province.
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get The city. 
     * @return City The city.
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set The city.
     * @param City The city.
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get The country or region. 
     * @return Country The country or region.
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set The country or region.
     * @param Country The country or region.
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get The key algorithm. 
     * @return EncryptAlgo The key algorithm.
     */
    public String getEncryptAlgo() {
        return this.EncryptAlgo;
    }

    /**
     * Set The key algorithm.
     * @param EncryptAlgo The key algorithm.
     */
    public void setEncryptAlgo(String EncryptAlgo) {
        this.EncryptAlgo = EncryptAlgo;
    }

    /**
     * Get The algorithm parameter. 
     * @return KeyParameter The algorithm parameter.
     */
    public String getKeyParameter() {
        return this.KeyParameter;
    }

    /**
     * Set The algorithm parameter.
     * @param KeyParameter The algorithm parameter.
     */
    public void setKeyParameter(String KeyParameter) {
        this.KeyParameter = KeyParameter;
    }

    /**
     * Get The remarks. 
     * @return Remarks The remarks.
     */
    public String getRemarks() {
        return this.Remarks;
    }

    /**
     * Set The remarks.
     * @param Remarks The remarks.
     */
    public void setRemarks(String Remarks) {
        this.Remarks = Remarks;
    }

    /**
     * Get The status. 
     * @return Status The status.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set The status.
     * @param Status The status.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get The password of the private key.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return KeyPassword The password of the private key.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getKeyPassword() {
        return this.KeyPassword;
    }

    /**
     * Set The password of the private key.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param KeyPassword The password of the private key.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKeyPassword(String KeyPassword) {
        this.KeyPassword = KeyPassword;
    }

    /**
     * Get The creation time. 
     * @return CreateTime The creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The creation time.
     * @param CreateTime The creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get The CSR content.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CSR The CSR content.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCSR() {
        return this.CSR;
    }

    /**
     * Set The CSR content.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CSR The CSR content.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCSR(String CSR) {
        this.CSR = CSR;
    }

    /**
     * Get The content of the private key.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PrivateKey The content of the private key.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set The content of the private key.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PrivateKey The content of the private key.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
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

    public DescribeCSRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCSRResponse(DescribeCSRResponse source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Organization != null) {
            this.Organization = new String(source.Organization);
        }
        if (source.Department != null) {
            this.Department = new String(source.Department);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.EncryptAlgo != null) {
            this.EncryptAlgo = new String(source.EncryptAlgo);
        }
        if (source.KeyParameter != null) {
            this.KeyParameter = new String(source.KeyParameter);
        }
        if (source.Remarks != null) {
            this.Remarks = new String(source.Remarks);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.KeyPassword != null) {
            this.KeyPassword = new String(source.KeyPassword);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.CSR != null) {
            this.CSR = new String(source.CSR);
        }
        if (source.PrivateKey != null) {
            this.PrivateKey = new String(source.PrivateKey);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Organization", this.Organization);
        this.setParamSimple(map, prefix + "Department", this.Department);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "EncryptAlgo", this.EncryptAlgo);
        this.setParamSimple(map, prefix + "KeyParameter", this.KeyParameter);
        this.setParamSimple(map, prefix + "Remarks", this.Remarks);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "KeyPassword", this.KeyPassword);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "CSR", this.CSR);
        this.setParamSimple(map, prefix + "PrivateKey", this.PrivateKey);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

