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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComposeMediaTrack extends AbstractModel {

    /**
    * The track type. Valid values:<ul><li>`Video`: Video track. A video track can consist of the following elements:</li><ul><li>Video</li><li>Image</li><li>Transition</li><li>Empty</li></ul><li>`Audio`: Audio track. An audio track can consist of the following elements:</li><ul><li>Audio</li><li>Transition</li><li>Empty</li></ul><li>`Title`: Text track. A text track can consist of the following elements: </li><ul><li>Subtitle</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The elements of a track.
    */
    @SerializedName("Items")
    @Expose
    private ComposeMediaItem [] Items;

    /**
     * Get The track type. Valid values:<ul><li>`Video`: Video track. A video track can consist of the following elements:</li><ul><li>Video</li><li>Image</li><li>Transition</li><li>Empty</li></ul><li>`Audio`: Audio track. An audio track can consist of the following elements:</li><ul><li>Audio</li><li>Transition</li><li>Empty</li></ul><li>`Title`: Text track. A text track can consist of the following elements: </li><ul><li>Subtitle</li></ul> 
     * @return Type The track type. Valid values:<ul><li>`Video`: Video track. A video track can consist of the following elements:</li><ul><li>Video</li><li>Image</li><li>Transition</li><li>Empty</li></ul><li>`Audio`: Audio track. An audio track can consist of the following elements:</li><ul><li>Audio</li><li>Transition</li><li>Empty</li></ul><li>`Title`: Text track. A text track can consist of the following elements: </li><ul><li>Subtitle</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The track type. Valid values:<ul><li>`Video`: Video track. A video track can consist of the following elements:</li><ul><li>Video</li><li>Image</li><li>Transition</li><li>Empty</li></ul><li>`Audio`: Audio track. An audio track can consist of the following elements:</li><ul><li>Audio</li><li>Transition</li><li>Empty</li></ul><li>`Title`: Text track. A text track can consist of the following elements: </li><ul><li>Subtitle</li></ul>
     * @param Type The track type. Valid values:<ul><li>`Video`: Video track. A video track can consist of the following elements:</li><ul><li>Video</li><li>Image</li><li>Transition</li><li>Empty</li></ul><li>`Audio`: Audio track. An audio track can consist of the following elements:</li><ul><li>Audio</li><li>Transition</li><li>Empty</li></ul><li>`Title`: Text track. A text track can consist of the following elements: </li><ul><li>Subtitle</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The elements of a track. 
     * @return Items The elements of a track.
     */
    public ComposeMediaItem [] getItems() {
        return this.Items;
    }

    /**
     * Set The elements of a track.
     * @param Items The elements of a track.
     */
    public void setItems(ComposeMediaItem [] Items) {
        this.Items = Items;
    }

    public ComposeMediaTrack() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeMediaTrack(ComposeMediaTrack source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Items != null) {
            this.Items = new ComposeMediaItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new ComposeMediaItem(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

