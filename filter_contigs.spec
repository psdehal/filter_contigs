/*
A KBase module: filter_contigs
This sample module contains one small method - count_contigs.
*/

module filter_contigs {
	/*
	A string representing a ContigSet id.
	*/
	typedef string contigset_id;
	
	/*
	A string representing a workspace name.
	*/
	typedef string workspace_name;
	
	typedef structure {
	    int contig_count;
	} CountContigsResults;
	
	/*
	Count contigs in a ContigSet
	contigset_id - the ContigSet to count.
	*/
	funcdef count_contigs(workspace_name,contigset_id) returns (CountContigsResults) authentication required;

	typedef structure {
		string input_contigset;
		string input_ws;
		string output_ws;
		string output_contigset_name;
		int min_length;
	} filter_contigs_by_length_input_params;

	funcdef filter_contigs_by_length(filter_contigs_by_length_input_params input_params)
		returns (string report)
		authentication required;
};