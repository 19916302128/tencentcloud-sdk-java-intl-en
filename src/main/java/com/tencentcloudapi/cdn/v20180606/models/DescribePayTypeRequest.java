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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePayTypeRequest extends AbstractModel{

    /**
    * Specifies a service region.
`mainland`: queries billing methods within Mainland China;
`overseas`: queries billing methods outside Mainland China.
Default value: `mainland`.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Specifies the product to query, either `cdn` (default) or `ecdn`.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get Specifies a service region.
`mainland`: queries billing methods within Mainland China;
`overseas`: queries billing methods outside Mainland China.
Default value: `mainland`. 
     * @return Area Specifies a service region.
`mainland`: queries billing methods within Mainland China;
`overseas`: queries billing methods outside Mainland China.
Default value: `mainland`.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Specifies a service region.
`mainland`: queries billing methods within Mainland China;
`overseas`: queries billing methods outside Mainland China.
Default value: `mainland`.
     * @param Area Specifies a service region.
`mainland`: queries billing methods within Mainland China;
`overseas`: queries billing methods outside Mainland China.
Default value: `mainland`.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Specifies the product to query, either `cdn` (default) or `ecdn`. 
     * @return Product Specifies the product to query, either `cdn` (default) or `ecdn`.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Specifies the product to query, either `cdn` (default) or `ecdn`.
     * @param Product Specifies the product to query, either `cdn` (default) or `ecdn`.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public DescribePayTypeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePayTypeRequest(DescribePayTypeRequest source) {
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

