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
package com.tencentcloudapi.gpm.v20200820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartMatchingRequest extends AbstractModel{

    /**
    * MatchCode
    */
    @SerializedName("MatchCode")
    @Expose
    private String MatchCode;

    /**
    * Player information. Up to 200 entries can be entered.
    */
    @SerializedName("Players")
    @Expose
    private Player [] Players;

    /**
    * MatchTicket ID, which can contain up to 128 characters and can only contain numbers, letters, “.”, and “-”. This parameter is left empty by default. When it is empty, the MatchTicket ID will be automatically generated by GPM.
    */
    @SerializedName("MatchTicketId")
    @Expose
    private String MatchTicketId;

    /**
     * Get MatchCode 
     * @return MatchCode MatchCode
     */
    public String getMatchCode() {
        return this.MatchCode;
    }

    /**
     * Set MatchCode
     * @param MatchCode MatchCode
     */
    public void setMatchCode(String MatchCode) {
        this.MatchCode = MatchCode;
    }

    /**
     * Get Player information. Up to 200 entries can be entered. 
     * @return Players Player information. Up to 200 entries can be entered.
     */
    public Player [] getPlayers() {
        return this.Players;
    }

    /**
     * Set Player information. Up to 200 entries can be entered.
     * @param Players Player information. Up to 200 entries can be entered.
     */
    public void setPlayers(Player [] Players) {
        this.Players = Players;
    }

    /**
     * Get MatchTicket ID, which can contain up to 128 characters and can only contain numbers, letters, “.”, and “-”. This parameter is left empty by default. When it is empty, the MatchTicket ID will be automatically generated by GPM. 
     * @return MatchTicketId MatchTicket ID, which can contain up to 128 characters and can only contain numbers, letters, “.”, and “-”. This parameter is left empty by default. When it is empty, the MatchTicket ID will be automatically generated by GPM.
     */
    public String getMatchTicketId() {
        return this.MatchTicketId;
    }

    /**
     * Set MatchTicket ID, which can contain up to 128 characters and can only contain numbers, letters, “.”, and “-”. This parameter is left empty by default. When it is empty, the MatchTicket ID will be automatically generated by GPM.
     * @param MatchTicketId MatchTicket ID, which can contain up to 128 characters and can only contain numbers, letters, “.”, and “-”. This parameter is left empty by default. When it is empty, the MatchTicket ID will be automatically generated by GPM.
     */
    public void setMatchTicketId(String MatchTicketId) {
        this.MatchTicketId = MatchTicketId;
    }

    public StartMatchingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartMatchingRequest(StartMatchingRequest source) {
        if (source.MatchCode != null) {
            this.MatchCode = new String(source.MatchCode);
        }
        if (source.Players != null) {
            this.Players = new Player[source.Players.length];
            for (int i = 0; i < source.Players.length; i++) {
                this.Players[i] = new Player(source.Players[i]);
            }
        }
        if (source.MatchTicketId != null) {
            this.MatchTicketId = new String(source.MatchTicketId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MatchCode", this.MatchCode);
        this.setParamArrayObj(map, prefix + "Players.", this.Players);
        this.setParamSimple(map, prefix + "MatchTicketId", this.MatchTicketId);

    }
}
