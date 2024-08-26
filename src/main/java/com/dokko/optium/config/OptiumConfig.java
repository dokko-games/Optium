package com.dokko.optium.config;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class OptiumConfig implements Serializable {
    private boolean zFirstPass = true;
}
