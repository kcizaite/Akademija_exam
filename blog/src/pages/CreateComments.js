import { useState } from "react"

export function CreateCommentsPage(props) {
    const [name, setName] = useState("")
    const [comment, setComment] = useState("")

    const createComment = () => {
        fetch('/api/v1/comments', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                name,
                comment,
            })
        })
    }

    return (
        <div>
            <div>
                <h1>Palikti komentara</h1>
            </div>
            <div>
                <label htmlFor="name">Autorius </label>
            </div>
            <div>
                <input
                    id="name"
                    value={name}
                    onChange={
                        (e) => setName(e.target.value)
                    } />
            </div>
            <div>
                <label htmlFor="comment">Komentaras </label>
            </div>
            <div>
                <input
                    id="name"
                    value={name}
                    onChange={
                        (e) => setName(e.target.value)
                    } />
            </div>
            <div>
                <button onClick={createComment}>Komentuoti</button>
            </div>
            <div>
                <h3>
                    Komentarai
                </h3>
            </div>
        </div >
    )
}