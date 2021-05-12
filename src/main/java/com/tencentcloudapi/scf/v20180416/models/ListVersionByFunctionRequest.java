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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListVersionByFunctionRequest extends AbstractModel{

    /**
    * Function Name
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * The namespace where the function locates
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Data offset. The default value is `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Return data length. The default value is `20`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * It specifies whether to return the results in ascending or descending order. The value is `ASC` or `DESC`.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * It specifies the sorting order of the results according to a specified field, such as `AddTime`, `ModTime`.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
     * Get Function Name 
     * @return FunctionName Function Name
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set Function Name
     * @param FunctionName Function Name
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get The namespace where the function locates 
     * @return Namespace The namespace where the function locates
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set The namespace where the function locates
     * @param Namespace The namespace where the function locates
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Data offset. The default value is `0`. 
     * @return Offset Data offset. The default value is `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Data offset. The default value is `0`.
     * @param Offset Data offset. The default value is `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Return data length. The default value is `20`. 
     * @return Limit Return data length. The default value is `20`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Return data length. The default value is `20`.
     * @param Limit Return data length. The default value is `20`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get It specifies whether to return the results in ascending or descending order. The value is `ASC` or `DESC`. 
     * @return Order It specifies whether to return the results in ascending or descending order. The value is `ASC` or `DESC`.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set It specifies whether to return the results in ascending or descending order. The value is `ASC` or `DESC`.
     * @param Order It specifies whether to return the results in ascending or descending order. The value is `ASC` or `DESC`.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get It specifies the sorting order of the results according to a specified field, such as `AddTime`, `ModTime`. 
     * @return OrderBy It specifies the sorting order of the results according to a specified field, such as `AddTime`, `ModTime`.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set It specifies the sorting order of the results according to a specified field, such as `AddTime`, `ModTime`.
     * @param OrderBy It specifies the sorting order of the results according to a specified field, such as `AddTime`, `ModTime`.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    public ListVersionByFunctionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListVersionByFunctionRequest(ListVersionByFunctionRequest source) {
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);

    }
}

