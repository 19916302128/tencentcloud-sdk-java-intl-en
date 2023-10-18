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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartMatchingBackfillRequest extends AbstractModel {

    /**
    * MatchCode
    */
    @SerializedName("MatchCode")
    @Expose
    private String MatchCode;

    /**
    * Player information
    */
    @SerializedName("Players")
    @Expose
    private Player [] Players;

    /**
    * Game server session ID. It should contain 1 to 256 ASCII characters.
    */
    @SerializedName("GameServerSessionId")
    @Expose
    private String GameServerSessionId;

    /**
    * MatchTicket ID, which can contain 1 to 128 characters. This parameter is left empty by default, and in this case, MatchTicket ID will be automatically generated by GPM.
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
     * Get Player information 
     * @return Players Player information
     */
    public Player [] getPlayers() {
        return this.Players;
    }

    /**
     * Set Player information
     * @param Players Player information
     */
    public void setPlayers(Player [] Players) {
        this.Players = Players;
    }

    /**
     * Get Game server session ID. It should contain 1 to 256 ASCII characters. 
     * @return GameServerSessionId Game server session ID. It should contain 1 to 256 ASCII characters.
     */
    public String getGameServerSessionId() {
        return this.GameServerSessionId;
    }

    /**
     * Set Game server session ID. It should contain 1 to 256 ASCII characters.
     * @param GameServerSessionId Game server session ID. It should contain 1 to 256 ASCII characters.
     */
    public void setGameServerSessionId(String GameServerSessionId) {
        this.GameServerSessionId = GameServerSessionId;
    }

    /**
     * Get MatchTicket ID, which can contain 1 to 128 characters. This parameter is left empty by default, and in this case, MatchTicket ID will be automatically generated by GPM. 
     * @return MatchTicketId MatchTicket ID, which can contain 1 to 128 characters. This parameter is left empty by default, and in this case, MatchTicket ID will be automatically generated by GPM.
     */
    public String getMatchTicketId() {
        return this.MatchTicketId;
    }

    /**
     * Set MatchTicket ID, which can contain 1 to 128 characters. This parameter is left empty by default, and in this case, MatchTicket ID will be automatically generated by GPM.
     * @param MatchTicketId MatchTicket ID, which can contain 1 to 128 characters. This parameter is left empty by default, and in this case, MatchTicket ID will be automatically generated by GPM.
     */
    public void setMatchTicketId(String MatchTicketId) {
        this.MatchTicketId = MatchTicketId;
    }

    public StartMatchingBackfillRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartMatchingBackfillRequest(StartMatchingBackfillRequest source) {
        if (source.MatchCode != null) {
            this.MatchCode = new String(source.MatchCode);
        }
        if (source.Players != null) {
            this.Players = new Player[source.Players.length];
            for (int i = 0; i < source.Players.length; i++) {
                this.Players[i] = new Player(source.Players[i]);
            }
        }
        if (source.GameServerSessionId != null) {
            this.GameServerSessionId = new String(source.GameServerSessionId);
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
        this.setParamSimple(map, prefix + "GameServerSessionId", this.GameServerSessionId);
        this.setParamSimple(map, prefix + "MatchTicketId", this.MatchTicketId);

    }
}

