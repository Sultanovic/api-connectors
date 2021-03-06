/**
 * Bybit API
 * ## REST API for the Bybit Exchange. Base URI: [https://api-testnet.bybit.com]  
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@bybit.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * PositionInfo.
 **/
@ApiModel(description = "PositionInfo.")
public class PositionInfo {
  
  @SerializedName("id")
  private BigDecimal id = null;
  @SerializedName("user_id")
  private BigDecimal userId = null;
  @SerializedName("risk_id")
  private BigDecimal riskId = null;
  @SerializedName("symbol")
  private String symbol = null;
  @SerializedName("side")
  private String side = null;
  @SerializedName("size")
  private BigDecimal size = null;
  @SerializedName("position_value")
  private BigDecimal positionValue = null;
  @SerializedName("entry_price")
  private BigDecimal entryPrice = null;
  @SerializedName("leverage")
  private BigDecimal leverage = null;
  @SerializedName("auto_add_margin")
  private BigDecimal autoAddMargin = null;
  @SerializedName("position_margin")
  private BigDecimal positionMargin = null;
  @SerializedName("liq_price")
  private BigDecimal liqPrice = null;
  @SerializedName("bust_price")
  private BigDecimal bustPrice = null;
  @SerializedName("occ_closing_fee")
  private BigDecimal occClosingFee = null;
  @SerializedName("occ_funding_fee")
  private BigDecimal occFundingFee = null;
  @SerializedName("take_profit")
  private BigDecimal takeProfit = null;
  @SerializedName("stop_loss")
  private BigDecimal stopLoss = null;
  @SerializedName("trailing_stop")
  private BigDecimal trailingStop = null;
  @SerializedName("position_status")
  private String positionStatus = null;
  @SerializedName("deleverage_indicator")
  private String deleverageIndicator = null;
  @SerializedName("oc_calc_data")
  private String ocCalcData = null;
  @SerializedName("order_margin")
  private BigDecimal orderMargin = null;
  @SerializedName("wallet_balance")
  private BigDecimal walletBalance = null;
  @SerializedName("unrealised_pnl")
  private BigDecimal unrealisedPnl = null;
  @SerializedName("realised_pnl")
  private BigDecimal realisedPnl = null;
  @SerializedName("cum_realised_pnl")
  private BigDecimal cumRealisedPnl = null;
  @SerializedName("cum_commission")
  private BigDecimal cumCommission = null;
  @SerializedName("cross_seq")
  private BigDecimal crossSeq = null;
  @SerializedName("position_seq")
  private BigDecimal positionSeq = null;
  @SerializedName("created_at")
  private String createdAt = null;
  @SerializedName("updated_at")
  private String updatedAt = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getId() {
    return id;
  }
  public void setId(BigDecimal id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getUserId() {
    return userId;
  }
  public void setUserId(BigDecimal userId) {
    this.userId = userId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getRiskId() {
    return riskId;
  }
  public void setRiskId(BigDecimal riskId) {
    this.riskId = riskId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSide() {
    return side;
  }
  public void setSide(String side) {
    this.side = side;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getSize() {
    return size;
  }
  public void setSize(BigDecimal size) {
    this.size = size;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getPositionValue() {
    return positionValue;
  }
  public void setPositionValue(BigDecimal positionValue) {
    this.positionValue = positionValue;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getEntryPrice() {
    return entryPrice;
  }
  public void setEntryPrice(BigDecimal entryPrice) {
    this.entryPrice = entryPrice;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getLeverage() {
    return leverage;
  }
  public void setLeverage(BigDecimal leverage) {
    this.leverage = leverage;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getAutoAddMargin() {
    return autoAddMargin;
  }
  public void setAutoAddMargin(BigDecimal autoAddMargin) {
    this.autoAddMargin = autoAddMargin;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getPositionMargin() {
    return positionMargin;
  }
  public void setPositionMargin(BigDecimal positionMargin) {
    this.positionMargin = positionMargin;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getLiqPrice() {
    return liqPrice;
  }
  public void setLiqPrice(BigDecimal liqPrice) {
    this.liqPrice = liqPrice;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getBustPrice() {
    return bustPrice;
  }
  public void setBustPrice(BigDecimal bustPrice) {
    this.bustPrice = bustPrice;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getOccClosingFee() {
    return occClosingFee;
  }
  public void setOccClosingFee(BigDecimal occClosingFee) {
    this.occClosingFee = occClosingFee;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getOccFundingFee() {
    return occFundingFee;
  }
  public void setOccFundingFee(BigDecimal occFundingFee) {
    this.occFundingFee = occFundingFee;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getTakeProfit() {
    return takeProfit;
  }
  public void setTakeProfit(BigDecimal takeProfit) {
    this.takeProfit = takeProfit;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getStopLoss() {
    return stopLoss;
  }
  public void setStopLoss(BigDecimal stopLoss) {
    this.stopLoss = stopLoss;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getTrailingStop() {
    return trailingStop;
  }
  public void setTrailingStop(BigDecimal trailingStop) {
    this.trailingStop = trailingStop;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPositionStatus() {
    return positionStatus;
  }
  public void setPositionStatus(String positionStatus) {
    this.positionStatus = positionStatus;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDeleverageIndicator() {
    return deleverageIndicator;
  }
  public void setDeleverageIndicator(String deleverageIndicator) {
    this.deleverageIndicator = deleverageIndicator;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOcCalcData() {
    return ocCalcData;
  }
  public void setOcCalcData(String ocCalcData) {
    this.ocCalcData = ocCalcData;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getOrderMargin() {
    return orderMargin;
  }
  public void setOrderMargin(BigDecimal orderMargin) {
    this.orderMargin = orderMargin;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getWalletBalance() {
    return walletBalance;
  }
  public void setWalletBalance(BigDecimal walletBalance) {
    this.walletBalance = walletBalance;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getUnrealisedPnl() {
    return unrealisedPnl;
  }
  public void setUnrealisedPnl(BigDecimal unrealisedPnl) {
    this.unrealisedPnl = unrealisedPnl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getRealisedPnl() {
    return realisedPnl;
  }
  public void setRealisedPnl(BigDecimal realisedPnl) {
    this.realisedPnl = realisedPnl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getCumRealisedPnl() {
    return cumRealisedPnl;
  }
  public void setCumRealisedPnl(BigDecimal cumRealisedPnl) {
    this.cumRealisedPnl = cumRealisedPnl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getCumCommission() {
    return cumCommission;
  }
  public void setCumCommission(BigDecimal cumCommission) {
    this.cumCommission = cumCommission;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getCrossSeq() {
    return crossSeq;
  }
  public void setCrossSeq(BigDecimal crossSeq) {
    this.crossSeq = crossSeq;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getPositionSeq() {
    return positionSeq;
  }
  public void setPositionSeq(BigDecimal positionSeq) {
    this.positionSeq = positionSeq;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PositionInfo positionInfo = (PositionInfo) o;
    return (this.id == null ? positionInfo.id == null : this.id.equals(positionInfo.id)) &&
        (this.userId == null ? positionInfo.userId == null : this.userId.equals(positionInfo.userId)) &&
        (this.riskId == null ? positionInfo.riskId == null : this.riskId.equals(positionInfo.riskId)) &&
        (this.symbol == null ? positionInfo.symbol == null : this.symbol.equals(positionInfo.symbol)) &&
        (this.side == null ? positionInfo.side == null : this.side.equals(positionInfo.side)) &&
        (this.size == null ? positionInfo.size == null : this.size.equals(positionInfo.size)) &&
        (this.positionValue == null ? positionInfo.positionValue == null : this.positionValue.equals(positionInfo.positionValue)) &&
        (this.entryPrice == null ? positionInfo.entryPrice == null : this.entryPrice.equals(positionInfo.entryPrice)) &&
        (this.leverage == null ? positionInfo.leverage == null : this.leverage.equals(positionInfo.leverage)) &&
        (this.autoAddMargin == null ? positionInfo.autoAddMargin == null : this.autoAddMargin.equals(positionInfo.autoAddMargin)) &&
        (this.positionMargin == null ? positionInfo.positionMargin == null : this.positionMargin.equals(positionInfo.positionMargin)) &&
        (this.liqPrice == null ? positionInfo.liqPrice == null : this.liqPrice.equals(positionInfo.liqPrice)) &&
        (this.bustPrice == null ? positionInfo.bustPrice == null : this.bustPrice.equals(positionInfo.bustPrice)) &&
        (this.occClosingFee == null ? positionInfo.occClosingFee == null : this.occClosingFee.equals(positionInfo.occClosingFee)) &&
        (this.occFundingFee == null ? positionInfo.occFundingFee == null : this.occFundingFee.equals(positionInfo.occFundingFee)) &&
        (this.takeProfit == null ? positionInfo.takeProfit == null : this.takeProfit.equals(positionInfo.takeProfit)) &&
        (this.stopLoss == null ? positionInfo.stopLoss == null : this.stopLoss.equals(positionInfo.stopLoss)) &&
        (this.trailingStop == null ? positionInfo.trailingStop == null : this.trailingStop.equals(positionInfo.trailingStop)) &&
        (this.positionStatus == null ? positionInfo.positionStatus == null : this.positionStatus.equals(positionInfo.positionStatus)) &&
        (this.deleverageIndicator == null ? positionInfo.deleverageIndicator == null : this.deleverageIndicator.equals(positionInfo.deleverageIndicator)) &&
        (this.ocCalcData == null ? positionInfo.ocCalcData == null : this.ocCalcData.equals(positionInfo.ocCalcData)) &&
        (this.orderMargin == null ? positionInfo.orderMargin == null : this.orderMargin.equals(positionInfo.orderMargin)) &&
        (this.walletBalance == null ? positionInfo.walletBalance == null : this.walletBalance.equals(positionInfo.walletBalance)) &&
        (this.unrealisedPnl == null ? positionInfo.unrealisedPnl == null : this.unrealisedPnl.equals(positionInfo.unrealisedPnl)) &&
        (this.realisedPnl == null ? positionInfo.realisedPnl == null : this.realisedPnl.equals(positionInfo.realisedPnl)) &&
        (this.cumRealisedPnl == null ? positionInfo.cumRealisedPnl == null : this.cumRealisedPnl.equals(positionInfo.cumRealisedPnl)) &&
        (this.cumCommission == null ? positionInfo.cumCommission == null : this.cumCommission.equals(positionInfo.cumCommission)) &&
        (this.crossSeq == null ? positionInfo.crossSeq == null : this.crossSeq.equals(positionInfo.crossSeq)) &&
        (this.positionSeq == null ? positionInfo.positionSeq == null : this.positionSeq.equals(positionInfo.positionSeq)) &&
        (this.createdAt == null ? positionInfo.createdAt == null : this.createdAt.equals(positionInfo.createdAt)) &&
        (this.updatedAt == null ? positionInfo.updatedAt == null : this.updatedAt.equals(positionInfo.updatedAt));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    result = 31 * result + (this.riskId == null ? 0: this.riskId.hashCode());
    result = 31 * result + (this.symbol == null ? 0: this.symbol.hashCode());
    result = 31 * result + (this.side == null ? 0: this.side.hashCode());
    result = 31 * result + (this.size == null ? 0: this.size.hashCode());
    result = 31 * result + (this.positionValue == null ? 0: this.positionValue.hashCode());
    result = 31 * result + (this.entryPrice == null ? 0: this.entryPrice.hashCode());
    result = 31 * result + (this.leverage == null ? 0: this.leverage.hashCode());
    result = 31 * result + (this.autoAddMargin == null ? 0: this.autoAddMargin.hashCode());
    result = 31 * result + (this.positionMargin == null ? 0: this.positionMargin.hashCode());
    result = 31 * result + (this.liqPrice == null ? 0: this.liqPrice.hashCode());
    result = 31 * result + (this.bustPrice == null ? 0: this.bustPrice.hashCode());
    result = 31 * result + (this.occClosingFee == null ? 0: this.occClosingFee.hashCode());
    result = 31 * result + (this.occFundingFee == null ? 0: this.occFundingFee.hashCode());
    result = 31 * result + (this.takeProfit == null ? 0: this.takeProfit.hashCode());
    result = 31 * result + (this.stopLoss == null ? 0: this.stopLoss.hashCode());
    result = 31 * result + (this.trailingStop == null ? 0: this.trailingStop.hashCode());
    result = 31 * result + (this.positionStatus == null ? 0: this.positionStatus.hashCode());
    result = 31 * result + (this.deleverageIndicator == null ? 0: this.deleverageIndicator.hashCode());
    result = 31 * result + (this.ocCalcData == null ? 0: this.ocCalcData.hashCode());
    result = 31 * result + (this.orderMargin == null ? 0: this.orderMargin.hashCode());
    result = 31 * result + (this.walletBalance == null ? 0: this.walletBalance.hashCode());
    result = 31 * result + (this.unrealisedPnl == null ? 0: this.unrealisedPnl.hashCode());
    result = 31 * result + (this.realisedPnl == null ? 0: this.realisedPnl.hashCode());
    result = 31 * result + (this.cumRealisedPnl == null ? 0: this.cumRealisedPnl.hashCode());
    result = 31 * result + (this.cumCommission == null ? 0: this.cumCommission.hashCode());
    result = 31 * result + (this.crossSeq == null ? 0: this.crossSeq.hashCode());
    result = 31 * result + (this.positionSeq == null ? 0: this.positionSeq.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.updatedAt == null ? 0: this.updatedAt.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositionInfo {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  riskId: ").append(riskId).append("\n");
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("  side: ").append(side).append("\n");
    sb.append("  size: ").append(size).append("\n");
    sb.append("  positionValue: ").append(positionValue).append("\n");
    sb.append("  entryPrice: ").append(entryPrice).append("\n");
    sb.append("  leverage: ").append(leverage).append("\n");
    sb.append("  autoAddMargin: ").append(autoAddMargin).append("\n");
    sb.append("  positionMargin: ").append(positionMargin).append("\n");
    sb.append("  liqPrice: ").append(liqPrice).append("\n");
    sb.append("  bustPrice: ").append(bustPrice).append("\n");
    sb.append("  occClosingFee: ").append(occClosingFee).append("\n");
    sb.append("  occFundingFee: ").append(occFundingFee).append("\n");
    sb.append("  takeProfit: ").append(takeProfit).append("\n");
    sb.append("  stopLoss: ").append(stopLoss).append("\n");
    sb.append("  trailingStop: ").append(trailingStop).append("\n");
    sb.append("  positionStatus: ").append(positionStatus).append("\n");
    sb.append("  deleverageIndicator: ").append(deleverageIndicator).append("\n");
    sb.append("  ocCalcData: ").append(ocCalcData).append("\n");
    sb.append("  orderMargin: ").append(orderMargin).append("\n");
    sb.append("  walletBalance: ").append(walletBalance).append("\n");
    sb.append("  unrealisedPnl: ").append(unrealisedPnl).append("\n");
    sb.append("  realisedPnl: ").append(realisedPnl).append("\n");
    sb.append("  cumRealisedPnl: ").append(cumRealisedPnl).append("\n");
    sb.append("  cumCommission: ").append(cumCommission).append("\n");
    sb.append("  crossSeq: ").append(crossSeq).append("\n");
    sb.append("  positionSeq: ").append(positionSeq).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  updatedAt: ").append(updatedAt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
