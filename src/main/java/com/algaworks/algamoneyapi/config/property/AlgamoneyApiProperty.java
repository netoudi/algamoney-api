package com.algaworks.algamoneyapi.config.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("algamoney")
public class AlgamoneyApiProperty {

	private String originPermitido = "http://localhost:8000";

	private final Seguranca seguranca = new Seguranca();

	public String getOriginPermitido() {
		return originPermitido;
	}

	public void setOriginPermitido(String originPermitido) {
		this.originPermitido = originPermitido;
	}

	public Seguranca getSeguranca() {
		return seguranca;
	}

	public static class Seguranca {

		private boolean enableHttps;

		public boolean isEnableHttps() {
			return enableHttps;
		}

		public void setEnableHttps(boolean enableHttps) {
			this.enableHttps = enableHttps;
		}

	}

}
