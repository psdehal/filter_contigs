#BEGIN_HEADER
from biokbase.workspace.client import Workspace as workspaceService
#END_HEADER


class filter_contigs:
    '''
    Module Name:
    filter_contigs

    Module Description:
    A KBase module: filter_contigs
This sample module contains one small method - count_contigs.
    '''

    ######## WARNING FOR GEVENT USERS #######
    # Since asynchronous IO can lead to methods - even the same method -
    # interrupting each other, you must be *very* careful when using global
    # state. A method could easily clobber the state set by another while
    # the latter method is running.
    #########################################
    #BEGIN_CLASS_HEADER
    workspaceURL = None
    #END_CLASS_HEADER

    # config contains contents of config file in a hash or None if it couldn't
    # be found
    def __init__(self, config):
        #BEGIN_CONSTRUCTOR
        self.workspaceURL = config['workspace-url']
        #END_CONSTRUCTOR
        pass

    def count_contigs(self, ctx, workspace_name, contigset_id):
        # ctx is the context object
        # return variables are: returnVal
        #BEGIN count_contigs
        token = ctx['token']
        wsClient = workspaceService(self.workspaceURL, token=token)
        contigSet = wsClient.get_objects([{'ref': workspace_name+'/'+contigset_id}])[0]['data']
        returnVal = {'contig_count': len(contigSet['contigs'])}
        #END count_contigs

        # At some point might do deeper type checking...
        if not isinstance(returnVal, dict):
            raise ValueError('Method count_contigs return value ' +
                             'returnVal is not type dict as required.')
        # return the results
        return [returnVal]

    def filter_contigs_by_length(self, ctx, input_params):
        # ctx is the context object
        # return variables are: report
        #BEGIN filter_contigs_by_length
        
        #END filter_contigs_by_length

        # At some point might do deeper type checking...
        if not isinstance(report, basestring):
            raise ValueError('Method filter_contigs_by_length return value ' +
                             'report is not type basestring as required.')
        # return the results
        return [report]
