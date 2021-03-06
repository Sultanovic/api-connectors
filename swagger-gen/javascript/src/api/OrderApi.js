/**
 * Bybit API
 * ## REST API for the Bybit Exchange. Base URI: [https://api-testnet.bybit.com]  
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@bybit.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.8
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.BybitApi) {
      root.BybitApi = {};
    }
    root.BybitApi.OrderApi = factory(root.BybitApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * Order service.
   * @module api/OrderApi
   * @version 1.0.0
   */

  /**
   * Constructs a new OrderApi. 
   * @alias module:api/OrderApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the orderCancel operation.
     * @callback module:api/OrderApi~orderCancelCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get my active order list.
     * @param {String} orderId Order ID
     * @param {Object} opts Optional parameters
     * @param {String} opts.symbol Contract type.
     * @param {module:api/OrderApi~orderCancelCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    this.orderCancel = function(orderId, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'orderId' is set
      if (orderId === undefined || orderId === null) {
        throw new Error("Missing the required parameter 'orderId' when calling orderCancel");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
        'order_id': orderId,
        'symbol': opts['symbol']
      };

      var authNames = ['apiKey', 'apiSignature', 'timestamp'];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json'];
      var returnType = Object;

      return this.apiClient.callApi(
        '/open-api/order/cancel', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the orderCancelAll operation.
     * @callback module:api/OrderApi~orderCancelAllCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get my active order list.
     * @param {String} symbol Contract type.
     * @param {module:api/OrderApi~orderCancelAllCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    this.orderCancelAll = function(symbol, callback) {
      var postBody = null;

      // verify the required parameter 'symbol' is set
      if (symbol === undefined || symbol === null) {
        throw new Error("Missing the required parameter 'symbol' when calling orderCancelAll");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
        'symbol': symbol
      };

      var authNames = ['apiKey', 'apiSignature', 'timestamp'];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json'];
      var returnType = Object;

      return this.apiClient.callApi(
        '/v2/private/order/cancelAll', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the orderCancelV2 operation.
     * @callback module:api/OrderApi~orderCancelV2Callback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get my active order list.
     * @param {Object} opts Optional parameters
     * @param {String} opts.orderId Order ID
     * @param {String} opts.symbol Contract type.
     * @param {String} opts.orderLinkId Order link id.
     * @param {module:api/OrderApi~orderCancelV2Callback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    this.orderCancelV2 = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
        'order_id': opts['orderId'],
        'symbol': opts['symbol'],
        'order_link_id': opts['orderLinkId']
      };

      var authNames = ['apiKey', 'apiSignature', 'timestamp'];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json'];
      var returnType = Object;

      return this.apiClient.callApi(
        '/v2/private/order/cancel', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the orderGetOrders operation.
     * @callback module:api/OrderApi~orderGetOrdersCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get my active order list.
     * @param {Object} opts Optional parameters
     * @param {String} opts.orderId Order ID
     * @param {String} opts.orderLinkId Customized order ID.
     * @param {String} opts.symbol Contract type. Default BTCUSD
     * @param {String} opts.order Sort orders by creation date
     * @param {Number} opts.page Page. Default getting first page data
     * @param {Number} opts.limit TLimit for data size per page, max size is 50. Default as showing 20 pieces of data per page
     * @param {String} opts.orderStatus Query your orders for all statuses if &#39;order_status&#39; is empty. If you want to query orders with specific statuses , you can pass the order_status split by
     * @param {module:api/OrderApi~orderGetOrdersCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    this.orderGetOrders = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'order_id': opts['orderId'],
        'order_link_id': opts['orderLinkId'],
        'symbol': opts['symbol'],
        'order': opts['order'],
        'page': opts['page'],
        'limit': opts['limit'],
        'order_status': opts['orderStatus'],
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['apiKey', 'apiSignature', 'timestamp'];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json'];
      var returnType = Object;

      return this.apiClient.callApi(
        '/open-api/order/list', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the orderNew operation.
     * @callback module:api/OrderApi~orderNewCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Place active order
     * @param {String} side Side
     * @param {String} symbol Contract type.
     * @param {String} orderType Active order type
     * @param {Number} qty 
     * @param {String} timeInForce Time in force
     * @param {Object} opts Optional parameters
     * @param {Number} opts.price Order price.
     * @param {Number} opts.takeProfit take profit price
     * @param {Number} opts.stopLoss stop loss price
     * @param {Boolean} opts.reduceOnly reduce only
     * @param {Boolean} opts.closeOnTrigger close on trigger
     * @param {String} opts.orderLinkId TCustomized order ID, maximum length at 36 characters, and order ID under the same agency has to be unique.
     * @param {module:api/OrderApi~orderNewCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    this.orderNew = function(side, symbol, orderType, qty, timeInForce, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'side' is set
      if (side === undefined || side === null) {
        throw new Error("Missing the required parameter 'side' when calling orderNew");
      }

      // verify the required parameter 'symbol' is set
      if (symbol === undefined || symbol === null) {
        throw new Error("Missing the required parameter 'symbol' when calling orderNew");
      }

      // verify the required parameter 'orderType' is set
      if (orderType === undefined || orderType === null) {
        throw new Error("Missing the required parameter 'orderType' when calling orderNew");
      }

      // verify the required parameter 'qty' is set
      if (qty === undefined || qty === null) {
        throw new Error("Missing the required parameter 'qty' when calling orderNew");
      }

      // verify the required parameter 'timeInForce' is set
      if (timeInForce === undefined || timeInForce === null) {
        throw new Error("Missing the required parameter 'timeInForce' when calling orderNew");
      }


      var pathParams = {
      };
      var queryParams = {
        'price': opts['price'],
        'take_profit': opts['takeProfit'],
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
        'side': side,
        'symbol': symbol,
        'order_type': orderType,
        'qty': qty,
        'time_in_force': timeInForce,
        'stop_loss': opts['stopLoss'],
        'reduce_only': opts['reduceOnly'],
        'close_on_trigger': opts['closeOnTrigger'],
        'order_link_id': opts['orderLinkId']
      };

      var authNames = ['apiKey', 'apiSignature', 'timestamp'];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json'];
      var returnType = Object;

      return this.apiClient.callApi(
        '/open-api/order/create', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the orderNewV2 operation.
     * @callback module:api/OrderApi~orderNewV2Callback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Place active order
     * @param {String} side Side
     * @param {String} symbol Contract type.
     * @param {String} orderType Active order type
     * @param {Number} qty 
     * @param {String} timeInForce Time in force
     * @param {Object} opts Optional parameters
     * @param {Number} opts.price Order price.
     * @param {Number} opts.takeProfit take profit price
     * @param {Number} opts.stopLoss stop loss price
     * @param {Boolean} opts.reduceOnly reduce only
     * @param {Boolean} opts.closeOnTrigger close on trigger
     * @param {String} opts.orderLinkId TCustomized order ID, maximum length at 36 characters, and order ID under the same agency has to be unique.
     * @param {String} opts.trailingStop Trailing stop.
     * @param {module:api/OrderApi~orderNewV2Callback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    this.orderNewV2 = function(side, symbol, orderType, qty, timeInForce, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'side' is set
      if (side === undefined || side === null) {
        throw new Error("Missing the required parameter 'side' when calling orderNewV2");
      }

      // verify the required parameter 'symbol' is set
      if (symbol === undefined || symbol === null) {
        throw new Error("Missing the required parameter 'symbol' when calling orderNewV2");
      }

      // verify the required parameter 'orderType' is set
      if (orderType === undefined || orderType === null) {
        throw new Error("Missing the required parameter 'orderType' when calling orderNewV2");
      }

      // verify the required parameter 'qty' is set
      if (qty === undefined || qty === null) {
        throw new Error("Missing the required parameter 'qty' when calling orderNewV2");
      }

      // verify the required parameter 'timeInForce' is set
      if (timeInForce === undefined || timeInForce === null) {
        throw new Error("Missing the required parameter 'timeInForce' when calling orderNewV2");
      }


      var pathParams = {
      };
      var queryParams = {
        'price': opts['price'],
        'take_profit': opts['takeProfit'],
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
        'side': side,
        'symbol': symbol,
        'order_type': orderType,
        'qty': qty,
        'time_in_force': timeInForce,
        'stop_loss': opts['stopLoss'],
        'reduce_only': opts['reduceOnly'],
        'close_on_trigger': opts['closeOnTrigger'],
        'order_link_id': opts['orderLinkId'],
        'trailing_stop': opts['trailingStop']
      };

      var authNames = ['apiKey', 'apiSignature', 'timestamp'];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json'];
      var returnType = Object;

      return this.apiClient.callApi(
        '/v2/private/order/create', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the orderQuery operation.
     * @callback module:api/OrderApi~orderQueryCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get my active order list.
     * @param {Object} opts Optional parameters
     * @param {String} opts.orderId Order ID
     * @param {String} opts.symbol Contract type. Default BTCUSD
     * @param {module:api/OrderApi~orderQueryCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    this.orderQuery = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'order_id': opts['orderId'],
        'symbol': opts['symbol'],
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['apiKey', 'apiSignature', 'timestamp'];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json'];
      var returnType = Object;

      return this.apiClient.callApi(
        '/v2/private/order', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the orderReplace operation.
     * @callback module:api/OrderApi~orderReplaceCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Replace active order. Only incomplete orders can be modified. 
     * @param {String} orderId Order ID.
     * @param {String} symbol Contract type.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.pRQty Order quantity.
     * @param {Number} opts.pRPrice Order price.
     * @param {module:api/OrderApi~orderReplaceCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    this.orderReplace = function(orderId, symbol, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'orderId' is set
      if (orderId === undefined || orderId === null) {
        throw new Error("Missing the required parameter 'orderId' when calling orderReplace");
      }

      // verify the required parameter 'symbol' is set
      if (symbol === undefined || symbol === null) {
        throw new Error("Missing the required parameter 'symbol' when calling orderReplace");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
        'order_id': orderId,
        'symbol': symbol,
        'p_r_qty': opts['pRQty'],
        'p_r_price': opts['pRPrice']
      };

      var authNames = ['apiKey', 'apiSignature', 'timestamp'];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json'];
      var returnType = Object;

      return this.apiClient.callApi(
        '/open-api/order/replace', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
