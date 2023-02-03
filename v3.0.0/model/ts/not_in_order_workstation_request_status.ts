import { UUID } from 'apikana/default-types'
import { RequestStatus } from './request_status'

export interface NotInOrderWorkstationRequestStatus extends RequestStatus {
    /**
     * The active blockId at the time of the request
     */
    blockId?: UUID
}
