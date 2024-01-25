package com.mpesa_integration.services;


import com.mpesa_integration.dtosResponse.AccessTokenResponse;

public interface DarajaApi {

        /**
         * @return Returns Daraja API Access Token Response
         */
        AccessTokenResponse getAccessToken();
    }
