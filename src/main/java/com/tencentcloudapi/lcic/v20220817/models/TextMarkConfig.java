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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextMarkConfig extends AbstractModel {

    /**
    * The watermark text. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * The watermark text color. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Color")
    @Expose
    private String Color;

    /**
     * Get The watermark text. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Text The watermark text. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set The watermark text. Note: This field may return null, indicating that no valid values can be obtained.
     * @param Text The watermark text. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get The watermark text color. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Color The watermark text color. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getColor() {
        return this.Color;
    }

    /**
     * Set The watermark text color. Note: This field may return null, indicating that no valid values can be obtained.
     * @param Color The watermark text color. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    public TextMarkConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextMarkConfig(TextMarkConfig source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Color != null) {
            this.Color = new String(source.Color);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Color", this.Color);

    }
}

