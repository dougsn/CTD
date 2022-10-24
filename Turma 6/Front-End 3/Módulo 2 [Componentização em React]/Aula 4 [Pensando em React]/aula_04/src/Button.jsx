
// const Button = () => {
//     return (
//         <>

//         </>
//     )
// }



export const Button = (props) => <button onClick={props.click} style={{backgroundColor:props.color}}>{props.name}</button>

// export default Button;