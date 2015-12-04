
package us.kbase.filtercontigs;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: filter_contigs_by_length_input_params</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "input_contigset",
    "input_ws",
    "output_ws",
    "output_contigset_name",
    "min_length"
})
public class FilterContigsByLengthInputParams {

    @JsonProperty("input_contigset")
    private String inputContigset;
    @JsonProperty("input_ws")
    private String inputWs;
    @JsonProperty("output_ws")
    private String outputWs;
    @JsonProperty("output_contigset_name")
    private String outputContigsetName;
    @JsonProperty("min_length")
    private Long minLength;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("input_contigset")
    public String getInputContigset() {
        return inputContigset;
    }

    @JsonProperty("input_contigset")
    public void setInputContigset(String inputContigset) {
        this.inputContigset = inputContigset;
    }

    public FilterContigsByLengthInputParams withInputContigset(String inputContigset) {
        this.inputContigset = inputContigset;
        return this;
    }

    @JsonProperty("input_ws")
    public String getInputWs() {
        return inputWs;
    }

    @JsonProperty("input_ws")
    public void setInputWs(String inputWs) {
        this.inputWs = inputWs;
    }

    public FilterContigsByLengthInputParams withInputWs(String inputWs) {
        this.inputWs = inputWs;
        return this;
    }

    @JsonProperty("output_ws")
    public String getOutputWs() {
        return outputWs;
    }

    @JsonProperty("output_ws")
    public void setOutputWs(String outputWs) {
        this.outputWs = outputWs;
    }

    public FilterContigsByLengthInputParams withOutputWs(String outputWs) {
        this.outputWs = outputWs;
        return this;
    }

    @JsonProperty("output_contigset_name")
    public String getOutputContigsetName() {
        return outputContigsetName;
    }

    @JsonProperty("output_contigset_name")
    public void setOutputContigsetName(String outputContigsetName) {
        this.outputContigsetName = outputContigsetName;
    }

    public FilterContigsByLengthInputParams withOutputContigsetName(String outputContigsetName) {
        this.outputContigsetName = outputContigsetName;
        return this;
    }

    @JsonProperty("min_length")
    public Long getMinLength() {
        return minLength;
    }

    @JsonProperty("min_length")
    public void setMinLength(Long minLength) {
        this.minLength = minLength;
    }

    public FilterContigsByLengthInputParams withMinLength(Long minLength) {
        this.minLength = minLength;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return ((((((((((((("FilterContigsByLengthInputParams"+" [inputContigset=")+ inputContigset)+", inputWs=")+ inputWs)+", outputWs=")+ outputWs)+", outputContigsetName=")+ outputContigsetName)+", minLength=")+ minLength)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
