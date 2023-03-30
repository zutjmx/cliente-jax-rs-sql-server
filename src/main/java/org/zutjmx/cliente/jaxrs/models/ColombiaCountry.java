package org.zutjmx.cliente.jaxrs.models;

import java.util.ArrayList;

public class ColombiaCountry {
    public int id;
    public String name;
    public String description;
    public String stateCapital;
    public int surface;
    public int population;
    public ArrayList<String> languages;
    public String timeZone;
    public String currency;
    public String currencyCode;
    public String currencySymbol;
    public String isoCode;
    public String internetDomain;
    public String phonePrefix;
    public String radioPrefix;
    public String aircraftPrefix;
    public String subRegion;
    public String region;
    public ArrayList<String> borders;
    public ArrayList<String> flags;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStateCapital() {
        return stateCapital;
    }

    public void setStateCapital(String stateCapital) {
        this.stateCapital = stateCapital;
    }

    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public ArrayList<String> getLanguages() {
        return languages;
    }

    public void setLanguages(ArrayList<String> languages) {
        this.languages = languages;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getInternetDomain() {
        return internetDomain;
    }

    public void setInternetDomain(String internetDomain) {
        this.internetDomain = internetDomain;
    }

    public String getPhonePrefix() {
        return phonePrefix;
    }

    public void setPhonePrefix(String phonePrefix) {
        this.phonePrefix = phonePrefix;
    }

    public String getRadioPrefix() {
        return radioPrefix;
    }

    public void setRadioPrefix(String radioPrefix) {
        this.radioPrefix = radioPrefix;
    }

    public String getAircraftPrefix() {
        return aircraftPrefix;
    }

    public void setAircraftPrefix(String aircraftPrefix) {
        this.aircraftPrefix = aircraftPrefix;
    }

    public String getSubRegion() {
        return subRegion;
    }

    public void setSubRegion(String subRegion) {
        this.subRegion = subRegion;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ArrayList<String> getBorders() {
        return borders;
    }

    public void setBorders(ArrayList<String> borders) {
        this.borders = borders;
    }

    public ArrayList<String> getFlags() {
        return flags;
    }

    public void setFlags(ArrayList<String> flags) {
        this.flags = flags;
    }

    @Override
    public String toString() {
        return "ColombiaCountry {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", stateCapital='" + stateCapital + '\'' +
                ", surface=" + surface +
                ", population=" + population +
                ", languages=" + languages +
                ", timeZone='" + timeZone + '\'' +
                ", currency='" + currency + '\'' +
                ", currencyCode='" + currencyCode + '\'' +
                ", currencySymbol='" + currencySymbol + '\'' +
                ", isoCode='" + isoCode + '\'' +
                ", internetDomain='" + internetDomain + '\'' +
                ", phonePrefix='" + phonePrefix + '\'' +
                ", radioPrefix='" + radioPrefix + '\'' +
                ", aircraftPrefix='" + aircraftPrefix + '\'' +
                ", subRegion='" + subRegion + '\'' +
                ", region='" + region + '\'' +
                ", borders=" + borders +
                ", flags=" + flags +
                '}';
    }
}
